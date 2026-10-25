package app.chalo.ncmc.data.cardtransactions;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "", "Companion", "Lapp/chalo/ncmc/data/cardtransactions/CardMerchantTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardUnknownTransactionAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public interface CardTransaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6180a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransaction$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f6180a = new Companion();

        public final KSerializer<CardTransaction> serializer() {
            SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.ncmc.data.cardtransactions.CardTransaction", Reflection.a(CardTransaction.class), new KClass[]{Reflection.a(CardMerchantTransactionAppModel.class), Reflection.a(CardPassPurchaseTransactionAppModel.class), Reflection.a(CardRechargeTransactionAppModel.class), Reflection.a(CardTicketTransactionAppModel.class), Reflection.a(CardUnknownTransactionAppModel.class)}, new KSerializer[]{CardMerchantTransactionAppModel$$serializer.f6167a, CardPassPurchaseTransactionAppModel$$serializer.f6171a, CardRechargeTransactionAppModel$$serializer.f6175a, CardTicketTransactionAppModel$$serializer.f6179a, CardUnknownTransactionAppModel$$serializer.f6205a});
            sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
            return sealedClassSerializer;
        }
    }

    /* JADX INFO: renamed from: a */
    CardTransactionFareInfoAppModel getC();

    /* JADX INFO: renamed from: b */
    String getF6204a();

    /* JADX INFO: renamed from: c */
    long getB();
}
