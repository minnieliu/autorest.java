﻿using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace AutoRest.Java.DanModel
{
    [TestClass]
    public class JavaFileContentsTests
    {
        [TestMethod]
        public void Constructor()
        {
            JavaFileContents contents = new JavaFileContents();
            Assert.AreEqual("", contents.ToString());
        }

        [TestMethod]
        public void TextWithNull()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text(null);

            Assert.AreEqual("", contents.ToString());
        }

        [TestMethod]
        public void TextWithEmpty()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text("");

            Assert.AreEqual("", contents.ToString());
        }

        [TestMethod]
        public void TextWithWhitespace()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text("   ");

            Assert.AreEqual("   ", contents.ToString());
        }

        [TestMethod]
        public void TextWithLetters()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text("abc");

            Assert.AreEqual("abc", contents.ToString());
        }

        [TestMethod]
        public void TextWithNewLine()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text("\n");

            Assert.AreEqual("\n", contents.ToString());
        }

        [TestMethod]
        public void TextWithCarriageReturnNewLine()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text("\r\n");

            Assert.AreEqual("\r\n", contents.ToString());
        }

        [TestMethod]
        public void TextWithLettersAndNewLines()
        {
            JavaFileContents contents = new JavaFileContents();

            contents.Text("a\nbc\r\nd\nef");

            Assert.AreEqual("a\nbc\r\nd\nef", contents.ToString());
        }

        [TestMethod]
        public void TextWithWordWrapAndLargeTextWithNoWhitespace()
        {
            JavaFileContents contents = new JavaFileContents();
            contents.SetWordWrapIndex(5);

            contents.Text("12345678901234567890");

            Assert.AreEqual("12345678901234567890", contents.ToString());
        }

        [TestMethod]
        public void TextWithWordWrapAndTextWithSpaces()
        {
            JavaFileContents contents = new JavaFileContents();
            contents.SetWordWrapIndex(5);

            contents.Text("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0");

            Assert.AreEqual("1 2\n3 4\n5 6\n7 8\n9 0\n1 2\n3 4\n5 6\n7 8\n9 0", contents.ToString());
        }

        [TestMethod]
        public void TextWithLicenseTextAndNoPrefixAndNoWordWrap()
        {
            JavaFileContents contents = new JavaFileContents();

            const string originalText =
                "Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "Licensed under the MIT License.See License.txt in the project root for license information.\n" +
                "\n" +
                "Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                "\n" +
                "Changes may cause incorrect behavior and will be lost if the code is regenerated.";
            contents.Text(originalText);

            const string expectedText = originalText;
            string actualText = contents.ToString();
            Assert.AreEqual(expectedText, actualText);
        }

        [TestMethod]
        public void TextWithLicenseTextAndPrefixAndNoWordWrap()
        {
            JavaFileContents contents = new JavaFileContents();
            contents.AddToPrefix(" * ");

            const string originalText =
                "Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "Licensed under the MIT License.See License.txt in the project root for license information.\n" +
                "\n" +
                "Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                "\n" +
                "Changes may cause incorrect behavior and will be lost if the code is regenerated.";
            contents.Text(originalText);

            const string expectedText =
                " * Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                " * Licensed under the MIT License.See License.txt in the project root for license information.\n" +
                " * \n" +
                " * Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                " * \n" +
                " * Changes may cause incorrect behavior and will be lost if the code is regenerated.";
            string actualText = contents.ToString();
            Assert.AreEqual(expectedText, actualText);
        }

        [TestMethod]
        public void TextWithLicenseTextAndNoPrefixAndWordWrap()
        {
            JavaFileContents contents = new JavaFileContents();
            contents.SetWordWrapIndex(80);

            const string originalText =
                "Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "Licensed under the MIT License.See License.txt in the project root for license information.\n" +
                "\n" +
                "Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                "\n" +
                "Changes may cause incorrect behavior and will be lost if the code is regenerated.";
            contents.Text(originalText);

            const string expectedText =
                "Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "Licensed under the MIT License.See License.txt in the project root for license\n" +
                "information.\n" +
                "\n" +
                "Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                "\n" +
                "Changes may cause incorrect behavior and will be lost if the code is\n" +
                "regenerated.";
            string actualText = contents.ToString();
            Assert.AreEqual(expectedText, actualText);
        }

        [TestMethod]
        public void TextWithLicenseTextAndPrefixAndWordWrap()
        {
            JavaFileContents contents = new JavaFileContents();
            contents.AddToPrefix(" * ");
            contents.SetWordWrapIndex(80);

            const string originalText =
                "Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "Licensed under the MIT License.See License.txt in the project root for license information.\n" +
                "\n" +
                "Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                "\n" +
                "Changes may cause incorrect behavior and will be lost if the code is regenerated.";
            contents.Text(originalText);

            const string expectedText =
                " * Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                " * Licensed under the MIT License.See License.txt in the project root for\n" +
                " * license information.\n" +
                " * \n" +
                " * Code generated by Microsoft(R) AutoRest Code Generator.\n" +
                " * \n" +
                " * Changes may cause incorrect behavior and will be lost if the code is\n" +
                " * regenerated.";
            string actualText = contents.ToString();
            Assert.AreEqual(expectedText, actualText);
        }
    }
}
