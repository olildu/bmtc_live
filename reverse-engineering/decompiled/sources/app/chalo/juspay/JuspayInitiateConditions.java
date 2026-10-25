package app.chalo.juspay;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayInitiateConditions;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JuspayInitiateConditions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4046a;
    public final String b;

    public JuspayInitiateConditions(String str, String str2) {
        this.f4046a = str;
        this.b = str2;
    }

    public final boolean a() {
        String str;
        String str2 = this.f4046a;
        return (str2 == null || StringsKt.F(str2) || (str = this.b) == null || StringsKt.F(str)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuspayInitiateConditions)) {
            return false;
        }
        JuspayInitiateConditions juspayInitiateConditions = (JuspayInitiateConditions) obj;
        return Intrinsics.d(this.f4046a, juspayInitiateConditions.f4046a) && Intrinsics.d(this.b, juspayInitiateConditions.b);
    }

    public final int hashCode() {
        String str = this.f4046a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vo1.o("JuspayInitiateConditions(cityName=", this.f4046a, ", userId=", this.b, ")");
    }
}
