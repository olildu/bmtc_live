package app.chalo.validationsdk.blevalidation.ui;

import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/ValidationProcessSpecificInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationProcessSpecificInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10623a;
    public final String b;
    public final String c;
    public final String d;

    public ValidationProcessSpecificInfo(String bleValidationTone, String str, int i, String staticQrCode, boolean z) {
        z = (i & 1) != 0 ? true : z;
        bleValidationTone = (i & 2) != 0 ? "" : bleValidationTone;
        str = (i & 4) != 0 ? "" : str;
        staticQrCode = (i & 8) != 0 ? "" : staticQrCode;
        Intrinsics.i(bleValidationTone, "bleValidationTone");
        Intrinsics.i(staticQrCode, "staticQrCode");
        this.f10623a = z;
        this.b = bleValidationTone;
        this.c = str;
        this.d = staticQrCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationProcessSpecificInfo)) {
            return false;
        }
        ValidationProcessSpecificInfo validationProcessSpecificInfo = (ValidationProcessSpecificInfo) obj;
        return this.f10623a == validationProcessSpecificInfo.f10623a && this.b.equals(validationProcessSpecificInfo.b) && this.c.equals(validationProcessSpecificInfo.c) && this.d.equals(validationProcessSpecificInfo.d);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + nf1.e(nf1.e((this.f10623a ? 1231 : 1237) * 31, 31, this.b), 31, this.c)) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationProcessSpecificInfo(isQRAsBackupOptionEnabled=");
        sb.append(this.f10623a);
        sb.append(", bleValidationTone=");
        sb.append(this.b);
        sb.append(", bleTwoWayConnectionRequestHello=");
        return r30.i(sb, this.c, ", staticQrCode=", this.d, ", isActivationExpired=false)");
    }
}
