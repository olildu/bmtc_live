package app.chalo.home.data;

import androidx.compose.material3.internal.CalendarModelKt;
import defpackage.a70;
import defpackage.hq0;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/HistoryScreenConfigForCity;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HistoryScreenConfigForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(3)), null, null};
    public static final HistoryScreenConfigForCity i = new HistoryScreenConfigForCity(EmptyList.f17557a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2870a;
    public final boolean b;
    public final int c;
    public final int d;
    public final List e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/HistoryScreenConfigForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/HistoryScreenConfigForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HistoryScreenConfigForCity> serializer() {
            return HistoryScreenConfigForCity$$serializer.f2871a;
        }
    }

    public /* synthetic */ HistoryScreenConfigForCity(int i2, String str, boolean z, int i3, int i4, List list, long j, long j2) {
        if (31 != (i2 & 31)) {
            PluginExceptionsKt.b(HistoryScreenConfigForCity$$serializer.f2871a.getDescriptor(), i2, 31);
            throw null;
        }
        this.f2870a = str;
        this.b = z;
        this.c = i3;
        this.d = i4;
        this.e = list;
        if ((i2 & 32) == 0) {
            this.f = CalendarModelKt.MillisecondsIn24Hours;
        } else {
            this.f = j;
        }
        if ((i2 & 64) == 0) {
            this.g = 30000L;
        } else {
            this.g = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryScreenConfigForCity)) {
            return false;
        }
        HistoryScreenConfigForCity historyScreenConfigForCity = (HistoryScreenConfigForCity) obj;
        return Intrinsics.d(this.f2870a, historyScreenConfigForCity.f2870a) && this.b == historyScreenConfigForCity.b && this.c == historyScreenConfigForCity.c && this.d == historyScreenConfigForCity.d && Intrinsics.d(this.e, historyScreenConfigForCity.e) && this.f == historyScreenConfigForCity.f && this.g == historyScreenConfigForCity.g;
    }

    public final int hashCode() {
        int iB = r30.b(((((((this.f2870a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31, 31, this.e);
        long j = this.f;
        long j2 = this.g;
        return ((iB + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("HistoryScreenConfigForCity(cityName=", this.f2870a, ", isEnabled=", ", minAppVer=", this.b);
        hq0.p(this.c, this.d, ", maxAppVer=", ", blacklistedAppVer=", sbM);
        sbM.append(this.e);
        sbM.append(", passRenewNudgeTimeInMillis=");
        sbM.append(this.f);
        return t10.g(this.g, ", thresholdToReTriggerHistoryCall=", ")", sbM);
    }

    public HistoryScreenConfigForCity(List blacklistedAppVer) {
        Intrinsics.i(blacklistedAppVer, "blacklistedAppVer");
        this.f2870a = "";
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = blacklistedAppVer;
        this.f = CalendarModelKt.MillisecondsIn24Hours;
        this.g = 30000L;
    }
}
