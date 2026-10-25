package app.chalo.uistate.textField;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/UIKeyboardOption;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UIKeyboardOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKeyboardCapitalization f10111a;
    public final UIKeyboardType b;
    public final UIImeActionHandler c;

    public UIKeyboardOption(UIKeyboardCapitalization uIKeyboardCapitalization, UIKeyboardType keyboardType, UIImeActionHandler uIImeActionHandler, int i) {
        uIKeyboardCapitalization = (i & 1) != 0 ? null : uIKeyboardCapitalization;
        keyboardType = (i & 2) != 0 ? UIKeyboardType.Text : keyboardType;
        uIImeActionHandler = (i & 4) != 0 ? null : uIImeActionHandler;
        Intrinsics.i(keyboardType, "keyboardType");
        this.f10111a = uIKeyboardCapitalization;
        this.b = keyboardType;
        this.c = uIImeActionHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIKeyboardOption)) {
            return false;
        }
        UIKeyboardOption uIKeyboardOption = (UIKeyboardOption) obj;
        return this.f10111a == uIKeyboardOption.f10111a && this.b == uIKeyboardOption.b && Intrinsics.d(this.c, uIKeyboardOption.c);
    }

    public final int hashCode() {
        UIKeyboardCapitalization uIKeyboardCapitalization = this.f10111a;
        int iHashCode = (this.b.hashCode() + ((uIKeyboardCapitalization == null ? 0 : uIKeyboardCapitalization.hashCode()) * 31)) * 31;
        UIImeActionHandler uIImeActionHandler = this.c;
        return iHashCode + (uIImeActionHandler != null ? uIImeActionHandler.hashCode() : 0);
    }

    public final String toString() {
        return "UIKeyboardOption(capitalization=" + this.f10111a + ", keyboardType=" + this.b + ", imeAction=" + this.c + ")";
    }
}
