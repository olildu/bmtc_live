package app.chalo.ncmc.data.cardtransactions;

import defpackage.r1;
import defpackage.sf;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "", "Companion", "Recharge", "Ticket", "PassPurchase", "MerchantTransaction", "Unknown", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$MerchantTransaction;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$PassPurchase;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Recharge;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Ticket;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = ChaloCardTransactionTypeDeserializer.class)
public abstract class CardTransactionTypeApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTransactionTypeApiResponse> serializer() {
            return ChaloCardTransactionTypeDeserializer.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$MerchantTransaction;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MerchantTransaction extends CardTransactionTypeApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6192a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$MerchantTransaction$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$MerchantTransaction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MerchantTransaction> serializer() {
                return CardTransactionTypeApiResponse$MerchantTransaction$$serializer.f6193a;
            }
        }

        public MerchantTransaction(int i, List list) {
            if (1 == (i & 1)) {
                this.f6192a = list;
            } else {
                PluginExceptionsKt.b(CardTransactionTypeApiResponse$MerchantTransaction$$serializer.f6193a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6200a() {
            return this.f6192a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantTransaction) && Intrinsics.d(this.f6192a, ((MerchantTransaction) obj).f6192a);
        }

        public final int hashCode() {
            return this.f6192a.hashCode();
        }

        public final String toString() {
            return r1.d("MerchantTransaction(transactionList=", ")", this.f6192a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$PassPurchase;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PassPurchase extends CardTransactionTypeApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(1))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6194a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$PassPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$PassPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PassPurchase> serializer() {
                return CardTransactionTypeApiResponse$PassPurchase$$serializer.f6195a;
            }
        }

        public PassPurchase(int i, List list) {
            if (1 == (i & 1)) {
                this.f6194a = list;
            } else {
                PluginExceptionsKt.b(CardTransactionTypeApiResponse$PassPurchase$$serializer.f6195a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6200a() {
            return this.f6194a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassPurchase) && Intrinsics.d(this.f6194a, ((PassPurchase) obj).f6194a);
        }

        public final int hashCode() {
            return this.f6194a.hashCode();
        }

        public final String toString() {
            return r1.d("PassPurchase(transactionList=", ")", this.f6194a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Recharge;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Recharge extends CardTransactionTypeApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(2))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6196a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Recharge$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Recharge;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Recharge> serializer() {
                return CardTransactionTypeApiResponse$Recharge$$serializer.f6197a;
            }
        }

        public Recharge(int i, List list) {
            if (1 == (i & 1)) {
                this.f6196a = list;
            } else {
                PluginExceptionsKt.b(CardTransactionTypeApiResponse$Recharge$$serializer.f6197a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6200a() {
            return this.f6196a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Recharge) && Intrinsics.d(this.f6196a, ((Recharge) obj).f6196a);
        }

        public final int hashCode() {
            return this.f6196a.hashCode();
        }

        public final String toString() {
            return r1.d("Recharge(transactionList=", ")", this.f6196a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Ticket;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Ticket extends CardTransactionTypeApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(3))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6198a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Ticket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Ticket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Ticket> serializer() {
                return CardTransactionTypeApiResponse$Ticket$$serializer.f6199a;
            }
        }

        public Ticket(int i, List list) {
            if (1 == (i & 1)) {
                this.f6198a = list;
            } else {
                PluginExceptionsKt.b(CardTransactionTypeApiResponse$Ticket$$serializer.f6199a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6200a() {
            return this.f6198a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ticket) && Intrinsics.d(this.f6198a, ((Ticket) obj).f6198a);
        }

        public final int hashCode() {
            return this.f6198a.hashCode();
        }

        public final String toString() {
            return r1.d("Ticket(transactionList=", ")", this.f6198a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Unknown;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unknown extends CardTransactionTypeApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(4))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6200a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Unknown$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Unknown> serializer() {
                return CardTransactionTypeApiResponse$Unknown$$serializer.f6201a;
            }
        }

        public Unknown(int i, List list) {
            if (1 == (i & 1)) {
                this.f6200a = list;
            } else {
                PluginExceptionsKt.b(CardTransactionTypeApiResponse$Unknown$$serializer.f6201a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6200a() {
            return this.f6200a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f6200a, ((Unknown) obj).f6200a);
        }

        public final int hashCode() {
            return this.f6200a.hashCode();
        }

        public final String toString() {
            return r1.d("Unknown(transactionList=", ")", this.f6200a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract List getF6200a();
}
