package app.chalo.home.data.model;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/PremiumPassSavingsInfo;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumPassSavingsInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2874a;
    public final Integer b;
    public final String c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/PremiumPassSavingsInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/PremiumPassSavingsInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumPassSavingsInfo> serializer() {
            return PremiumPassSavingsInfo$$serializer.f2875a;
        }
    }

    public /* synthetic */ PremiumPassSavingsInfo(int i, Integer num, Integer num2, String str, boolean z) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.b(PremiumPassSavingsInfo$$serializer.f2875a.getDescriptor(), i, 12);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f2874a = null;
        } else {
            this.f2874a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumPassSavingsInfo)) {
            return false;
        }
        PremiumPassSavingsInfo premiumPassSavingsInfo = (PremiumPassSavingsInfo) obj;
        return Intrinsics.d(this.f2874a, premiumPassSavingsInfo.f2874a) && Intrinsics.d(this.b, premiumPassSavingsInfo.b) && Intrinsics.d(this.c, premiumPassSavingsInfo.c) && this.d == premiumPassSavingsInfo.d;
    }

    public final int hashCode() {
        Integer num = this.f2874a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return nf1.e((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.c) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "PremiumPassSavingsInfo(oldPassSaving=" + this.f2874a + ", updatedPassSaving=" + this.b + ", currencySymbol=" + this.c + ", isSavingIncreased=" + this.d + ")";
    }

    public PremiumPassSavingsInfo(Integer num, Integer num2, String currencySymbol, boolean z) {
        Intrinsics.i(currencySymbol, "currencySymbol");
        this.f2874a = num;
        this.b = num2;
        this.c = currencySymbol;
        this.d = z;
    }
}
