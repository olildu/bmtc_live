package app.chalo.ncmc.ui;

import app.chalo.constants.Source;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType;
import defpackage.xe;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/CardRechargeEnterAmountArgsModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeEnterAmountArgsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f6261a;
    public final ChaloCardRechargeAmountFlowType b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/CardRechargeEnterAmountArgsModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/CardRechargeEnterAmountArgsModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeEnterAmountArgsModel> serializer() {
            return CardRechargeEnterAmountArgsModel$$serializer.f6262a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new xe(9)), LazyKt.a(lazyThreadSafetyMode, new xe(10))};
    }

    public /* synthetic */ CardRechargeEnterAmountArgsModel(int i, Source source, ChaloCardRechargeAmountFlowType chaloCardRechargeAmountFlowType) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(CardRechargeEnterAmountArgsModel$$serializer.f6262a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6261a = source;
        this.b = chaloCardRechargeAmountFlowType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeEnterAmountArgsModel)) {
            return false;
        }
        CardRechargeEnterAmountArgsModel cardRechargeEnterAmountArgsModel = (CardRechargeEnterAmountArgsModel) obj;
        return this.f6261a == cardRechargeEnterAmountArgsModel.f6261a && Intrinsics.d(this.b, cardRechargeEnterAmountArgsModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6261a.hashCode() * 31);
    }

    public final String toString() {
        return "CardRechargeEnterAmountArgsModel(source=" + this.f6261a + ", flowType=" + this.b + ")";
    }

    public CardRechargeEnterAmountArgsModel(Source source, ChaloCardRechargeAmountFlowType chaloCardRechargeAmountFlowType) {
        Intrinsics.i(source, "source");
        this.f6261a = source;
        this.b = chaloCardRechargeAmountFlowType;
    }
}
