package app.chalo.models.ordercreation;

import app.chalo.models.CheckoutPaymentProvider;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.yn0;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel;", "", "Companion", "MerchantUPIConfigAppModel", "ProviderConfigAppModel", "ProviderPaymentUrl", "NoPaymentRequired", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$NoPaymentRequired;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderConfigAppModel;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderPaymentUrl;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class OrderPaymentProviderInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b;
    public static final Object c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutPaymentProvider f5657a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<OrderPaymentProviderInfoAppModel> serializer() {
            return (KSerializer) OrderPaymentProviderInfoAppModel.c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MerchantUPIConfigAppModel extends OrderPaymentProviderInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] h;
        public final CheckoutPaymentProvider d;
        public final String e;
        public final String f;
        public final String g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MerchantUPIConfigAppModel> serializer() {
                return OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer.f5658a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new yn0(23)), LazyKt.a(lazyThreadSafetyMode, new yn0(24)), null, null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MerchantUPIConfigAppModel(int i, CheckoutPaymentProvider checkoutPaymentProvider, CheckoutPaymentProvider checkoutPaymentProvider2, String str, String str2, String str3) {
            super(checkoutPaymentProvider);
            if (31 != (i & 31)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer.f5658a.getDescriptor(), i, 31);
                throw null;
            }
            this.d = checkoutPaymentProvider2;
            this.e = str;
            this.f = str2;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchantUPIConfigAppModel)) {
                return false;
            }
            MerchantUPIConfigAppModel merchantUPIConfigAppModel = (MerchantUPIConfigAppModel) obj;
            return this.d == merchantUPIConfigAppModel.d && Intrinsics.d(this.e, merchantUPIConfigAppModel.e) && Intrinsics.d(this.f, merchantUPIConfigAppModel.f) && Intrinsics.d(this.g, merchantUPIConfigAppModel.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MerchantUPIConfigAppModel(payProvider=");
            sb.append(this.d);
            sb.append(", vpa=");
            sb.append(this.e);
            sb.append(", name=");
            return r30.i(sb, this.f, ", code=", this.g, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantUPIConfigAppModel(CheckoutPaymentProvider payProvider, String vpa, String name, String code) {
            super(payProvider, 0);
            Intrinsics.i(payProvider, "payProvider");
            Intrinsics.i(vpa, "vpa");
            Intrinsics.i(name, "name");
            Intrinsics.i(code, "code");
            this.d = payProvider;
            this.e = vpa;
            this.f = name;
            this.g = code;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$NoPaymentRequired;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class NoPaymentRequired extends OrderPaymentProviderInfoAppModel {
        public static final NoPaymentRequired INSTANCE = new NoPaymentRequired(CheckoutPaymentProvider.NO_PAYMENT, 0);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(25));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<NoPaymentRequired> serializer() {
            return (KSerializer) d.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderConfigAppModel;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProviderConfigAppModel extends OrderPaymentProviderInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] j;
        public final CheckoutPaymentProvider d;
        public final OrderPaymentProviderCustomerDetailsAppModel e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ProviderConfigAppModel> serializer() {
                return OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer.f5659a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new yn0(26)), LazyKt.a(lazyThreadSafetyMode, new yn0(27)), null, null, null, null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProviderConfigAppModel(int i, CheckoutPaymentProvider checkoutPaymentProvider, CheckoutPaymentProvider checkoutPaymentProvider2, OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel, String str, String str2, String str3, String str4) {
            super(checkoutPaymentProvider);
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer.f5659a.getDescriptor(), i, 127);
                throw null;
            }
            this.d = checkoutPaymentProvider2;
            this.e = orderPaymentProviderCustomerDetailsAppModel;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderConfigAppModel)) {
                return false;
            }
            ProviderConfigAppModel providerConfigAppModel = (ProviderConfigAppModel) obj;
            return this.d == providerConfigAppModel.d && Intrinsics.d(this.e, providerConfigAppModel.e) && Intrinsics.d(this.f, providerConfigAppModel.f) && Intrinsics.d(this.g, providerConfigAppModel.g) && Intrinsics.d(this.h, providerConfigAppModel.h) && Intrinsics.d(this.i, providerConfigAppModel.i);
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() * 31;
            OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel = this.e;
            int iHashCode2 = (iHashCode + (orderPaymentProviderCustomerDetailsAppModel == null ? 0 : orderPaymentProviderCustomerDetailsAppModel.f5646a.hashCode())) * 31;
            String str = this.f;
            int iE = nf1.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
            String str2 = this.h;
            int iHashCode3 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProviderConfigAppModel(payProvider=");
            sb.append(this.d);
            sb.append(", customerConfig=");
            sb.append(this.e);
            sb.append(", accountId=");
            cb0.t(sb, this.f, ", key=", this.g, ", merchantKey=");
            return r30.i(sb, this.h, ", orderToken=", this.i, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderConfigAppModel(CheckoutPaymentProvider payProvider, OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel, String str, String key, String str2, String str3) {
            super(payProvider, 0);
            Intrinsics.i(payProvider, "payProvider");
            Intrinsics.i(key, "key");
            this.d = payProvider;
            this.e = orderPaymentProviderCustomerDetailsAppModel;
            this.f = str;
            this.g = key;
            this.h = str2;
            this.i = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderPaymentUrl;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProviderPaymentUrl extends OrderPaymentProviderInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f;
        public final CheckoutPaymentProvider d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderPaymentUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ProviderPaymentUrl> serializer() {
                return OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer.f5660a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new yn0(28)), LazyKt.a(lazyThreadSafetyMode, new yn0(29)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProviderPaymentUrl(int i, CheckoutPaymentProvider checkoutPaymentProvider, CheckoutPaymentProvider checkoutPaymentProvider2, String str) {
            super(checkoutPaymentProvider);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer.f5660a.getDescriptor(), i, 7);
                throw null;
            }
            this.d = checkoutPaymentProvider2;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderPaymentUrl)) {
                return false;
            }
            ProviderPaymentUrl providerPaymentUrl = (ProviderPaymentUrl) obj;
            return this.d == providerPaymentUrl.d && Intrinsics.d(this.e, providerPaymentUrl.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "ProviderPaymentUrl(payProvider=" + this.d + ", paymentUrl=" + this.e + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderPaymentUrl(CheckoutPaymentProvider payProvider, String paymentUrl) {
            super(payProvider, 0);
            Intrinsics.i(payProvider, "payProvider");
            Intrinsics.i(paymentUrl, "paymentUrl");
            this.d = payProvider;
            this.e = paymentUrl;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new yn0(21))};
        c = LazyKt.a(lazyThreadSafetyMode, new yn0(22));
    }

    public /* synthetic */ OrderPaymentProviderInfoAppModel(CheckoutPaymentProvider checkoutPaymentProvider) {
        this.f5657a = checkoutPaymentProvider;
    }

    public OrderPaymentProviderInfoAppModel(CheckoutPaymentProvider checkoutPaymentProvider, int i) {
        this.f5657a = checkoutPaymentProvider;
    }
}
