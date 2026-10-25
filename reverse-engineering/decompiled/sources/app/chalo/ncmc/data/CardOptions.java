package app.chalo.ncmc.data;

import defpackage.b3;
import defpackage.r30;
import defpackage.xe;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/CardOptions;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6024a;
    public final List b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/CardOptions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/CardOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardOptions> serializer() {
            return CardOptions$$serializer.f6025a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new xe(3)), LazyKt.a(lazyThreadSafetyMode, new xe(4)), null};
    }

    public CardOptions(int i, int i2, List list, List list2) {
        this.f6024a = (i & 1) == 0 ? EmptyList.f17557a : list;
        if ((i & 2) == 0) {
            this.b = EmptyList.f17557a;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = 10;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardOptions)) {
            return false;
        }
        CardOptions cardOptions = (CardOptions) obj;
        return Intrinsics.d(this.f6024a, cardOptions.f6024a) && Intrinsics.d(this.b, cardOptions.b) && this.c == cardOptions.c;
    }

    public final int hashCode() {
        return r30.b(this.f6024a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardOptions(homescreenCardExpOptions=");
        sb.append(this.f6024a);
        sb.append(", linkCardConfig=");
        sb.append(this.b);
        sb.append(", cardTransactionPageSize=");
        return b3.f(")", this.c, sb);
    }
}
