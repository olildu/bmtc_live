package app.chalo.models;

import defpackage.i71;
import defpackage.xe;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/CardRechargeFareInfo;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeFareInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5577a;
    public final long b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/CardRechargeFareInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/CardRechargeFareInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeFareInfo> serializer() {
            return CardRechargeFareInfo$$serializer.f5578a;
        }
    }

    public CardRechargeFareInfo(List suggestedAmounts, long j, long j2) {
        Intrinsics.i(suggestedAmounts, "suggestedAmounts");
        this.f5577a = j;
        this.b = j2;
        this.c = suggestedAmounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeFareInfo)) {
            return false;
        }
        CardRechargeFareInfo cardRechargeFareInfo = (CardRechargeFareInfo) obj;
        return this.f5577a == cardRechargeFareInfo.f5577a && this.b == cardRechargeFareInfo.b && Intrinsics.d(this.c, cardRechargeFareInfo.c);
    }

    public final int hashCode() {
        long j = this.f5577a;
        long j2 = this.b;
        return this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f5577a, "CardRechargeFareInfo(minAmount=", ", multiplesAllowed=");
        sbG.append(this.b);
        sbG.append(", suggestedAmounts=");
        sbG.append(this.c);
        sbG.append(")");
        return sbG.toString();
    }

    public /* synthetic */ CardRechargeFareInfo(List list, long j, long j2, int i) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(CardRechargeFareInfo$$serializer.f5578a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5577a = j;
        this.b = j2;
        this.c = list;
    }
}
