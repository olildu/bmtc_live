package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationDialogInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationDialogInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringEnum f10568a;
    public final StringEnum b;
    public final StringEnum c;
    public final StringEnum d;

    public BleValidationDialogInfo(StringEnum titleResourceId, StringEnum messageResourceId, StringEnum positiveBtnCopyResourceId, StringEnum negativeBtnCopyResourceId) {
        Intrinsics.i(titleResourceId, "titleResourceId");
        Intrinsics.i(messageResourceId, "messageResourceId");
        Intrinsics.i(positiveBtnCopyResourceId, "positiveBtnCopyResourceId");
        Intrinsics.i(negativeBtnCopyResourceId, "negativeBtnCopyResourceId");
        this.f10568a = titleResourceId;
        this.b = messageResourceId;
        this.c = positiveBtnCopyResourceId;
        this.d = negativeBtnCopyResourceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationDialogInfo)) {
            return false;
        }
        BleValidationDialogInfo bleValidationDialogInfo = (BleValidationDialogInfo) obj;
        return this.f10568a == bleValidationDialogInfo.f10568a && this.b == bleValidationDialogInfo.b && this.c == bleValidationDialogInfo.c && this.d == bleValidationDialogInfo.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10568a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BleValidationDialogInfo(titleResourceId=" + this.f10568a + ", messageResourceId=" + this.b + ", positiveBtnCopyResourceId=" + this.c + ", negativeBtnCopyResourceId=" + this.d + ")";
    }
}
