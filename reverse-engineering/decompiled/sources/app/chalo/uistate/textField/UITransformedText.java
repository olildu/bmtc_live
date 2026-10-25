package app.chalo.uistate.textField;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/UITransformedText;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UITransformedText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10113a;
    public final UITextFieldOffsetMapping b;

    public UITransformedText(String text, UITextFieldOffsetMapping uITextFieldOffsetMapping) {
        Intrinsics.i(text, "text");
        this.f10113a = text;
        this.b = uITextFieldOffsetMapping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UITransformedText)) {
            return false;
        }
        UITransformedText uITransformedText = (UITransformedText) obj;
        return Intrinsics.d(this.f10113a, uITransformedText.f10113a) && Intrinsics.d(this.b, uITransformedText.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10113a.hashCode() * 31);
    }

    public final String toString() {
        return "UITransformedText(text=" + this.f10113a + ", offsetMapping=" + this.b + ")";
    }
}
