package app.chalo.providers.toast;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/toast/KotlinToastData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KotlinToastData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8869a;
    public final ToastLength b;

    public KotlinToastData(String message, ToastLength length) {
        Intrinsics.i(message, "message");
        Intrinsics.i(length, "length");
        this.f8869a = message;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinToastData)) {
            return false;
        }
        KotlinToastData kotlinToastData = (KotlinToastData) obj;
        return Intrinsics.d(this.f8869a, kotlinToastData.f8869a) && this.b == kotlinToastData.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8869a.hashCode() * 31);
    }

    public final String toString() {
        return "KotlinToastData(message=" + this.f8869a + ", length=" + this.b + ")";
    }

    public /* synthetic */ KotlinToastData(String str) {
        this(str, ToastLength.LONG);
    }
}
