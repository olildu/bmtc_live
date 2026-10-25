package app.chalo.ncmc.ui.cardlinking.linking;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardLinkRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6277a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardLinkRestoredState> serializer() {
            return ChaloCardLinkRestoredState$$serializer.f6278a;
        }
    }

    public ChaloCardLinkRestoredState(int i, int i2, int i3, int i4, String cardNumber, String linkCode, String sampleReceiptUrl) {
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(linkCode, "linkCode");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        this.f6277a = cardNumber;
        this.b = linkCode;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = sampleReceiptUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardLinkRestoredState)) {
            return false;
        }
        ChaloCardLinkRestoredState chaloCardLinkRestoredState = (ChaloCardLinkRestoredState) obj;
        return Intrinsics.d(this.f6277a, chaloCardLinkRestoredState.f6277a) && Intrinsics.d(this.b, chaloCardLinkRestoredState.b) && this.c == chaloCardLinkRestoredState.c && this.d == chaloCardLinkRestoredState.d && this.e == chaloCardLinkRestoredState.e && this.f == chaloCardLinkRestoredState.f && Intrinsics.d(this.g, chaloCardLinkRestoredState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((((((((nf1.e(this.f6277a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloCardLinkRestoredState(cardNumber=", this.f6277a, ", linkCode=", this.b, ", maxCardNumberLength=");
        hq0.p(this.c, this.d, ", maxLinkCodeLength=", ", minCardNumberLength=", sbE);
        hq0.p(this.e, this.f, ", minLinkCodeLength=", ", sampleReceiptUrl=", sbE);
        return vo1.p(sbE, this.g, ")");
    }

    public /* synthetic */ ChaloCardLinkRestoredState(int i, String str, String str2, int i2, int i3, int i4, int i5, String str3) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ChaloCardLinkRestoredState$$serializer.f6278a.getDescriptor(), i, 127);
            throw null;
        }
        this.f6277a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = str3;
    }
}
