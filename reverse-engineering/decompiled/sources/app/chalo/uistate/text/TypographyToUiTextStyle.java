package app.chalo.uistate.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/uistate/text/TypographyToUiTextStyle;", "", "textStyle", "Lapp/chalo/uistate/text/UITextStyle;", "<init>", "(Ljava/lang/String;ILapp/chalo/uistate/text/UITextStyle;)V", "getTextStyle", "()Lapp/chalo/uistate/text/UITextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "body1", "body2", "caption", "overline", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TypographyToUiTextStyle {
    h1(UITextStyle.DisplayLarge),
    h2(UITextStyle.DisplayMedium),
    h3(UITextStyle.DisplaySmall),
    h4(UITextStyle.HeadlineMedium),
    h5(UITextStyle.HeadlineSmall),
    h6(UITextStyle.TitleLarge),
    body1(UITextStyle.BodyLarge),
    body2(UITextStyle.BodyMedium),
    caption(UITextStyle.BodySmall),
    overline(UITextStyle.LabelSmall);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final UITextStyle textStyle;

    TypographyToUiTextStyle(UITextStyle uITextStyle) {
        this.textStyle = uITextStyle;
    }

    public static EnumEntries<TypographyToUiTextStyle> getEntries() {
        return $ENTRIES;
    }

    public final UITextStyle getTextStyle() {
        return this.textStyle;
    }
}
