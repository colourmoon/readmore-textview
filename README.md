# Step By Step Guide for Implementing Read More & Read Less Textview in Android

ReadMoreTextView is a lightweight Android library that provides an easy implementation of "Read More" functionality for TextViews. It allows users to expand long text content for a better user experience.

## Features

* Simple integration with any TextView.
* Customizable "Read More" label.
* Customizable "Read Less" label.
* Adjustable maximum number of lines for the collapsed state.
* Smooth animation when expanding the text.

## Installation

Add the following dependency to your app's build.gradle file:
### Step 1 - For Installing the ReadMoreTextView Library
Add the JitPack link to your `project's build.gradle` file:

```kotlin
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2 - For Installing the ReadMoreTextView Library
Next, add the following dependency to your `app's build.gradle` file:

```kotlin
dependencies {
    implementation 'com.github.colourmoon:readmore-textview:v1.0.2'
}
```

## Usage

To use ReadMoreTextView in your project, follow these steps:
```xml
<com.colormoon.readmoretextview.ReadMoreTextView
    android:layout_width="match_parent"
    android:id="@+id/tvReadMoreLess"
    android:textColor="#000000"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:text="HERE GIVE YOUR TEXT"/>
```

Initialize the ReadMoreTextView in your activity or fragment:

```kotlin
ReadMoreTextView textView = findViewById(R.id.tvReadMoreLess);
textView.setText("YOUR LONG TEXT HERE");
```

Here you can change the text for Read More Or Read Less
```kotlin
textView.setCollapsedText("Read More")
textView.setExpandedText("Read Less")
```

Here you can change the text color for Read More Or Read Less
```kotlin
textView.setCollapsedTextColor(R.color.blue)
textView.setExpandedTextColor(R.color.blue)
```

Here you can change the text trim lines, You can select after how many lines you need to show Read More
```kotlin
textView.setTrimLines(4) //By Default it will be only 2 lines
```
That's it! Now your TextView will automatically show the "Read More" link when the text is longer than the specified maximum number of lines.

## Contributing

Contributions to ReadMoreTextView are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

ReadMoreTextView is released under the **MIT License**. See the [LICENSE](https://en.wikipedia.org/wiki/MIT_License) file for more details.

## Support

For any questions or support related to ReadMoreTextView, you can reach out to us at ronilgwalani@colourmoon.com, pushpendra@thecolourmoon.com or join our community forum.

## Credits

The ReadMoreTextView library was developed by [Ronil Gwalani](https://github.com/ronilgwalnai)

