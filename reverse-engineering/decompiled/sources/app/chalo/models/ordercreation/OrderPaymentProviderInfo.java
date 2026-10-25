package app.chalo.models.ordercreation;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.models.CheckoutPaymentProvider;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo;", "", "Serializer", "Basic", "CustomUrl", "YesBank", "PhonePe", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$Basic;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$CustomUrl;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$PhonePe;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$YesBank;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = Companion.class)
public abstract class OrderPaymentProviderInfo {

    /* JADX INFO: renamed from: Serializer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$Basic;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Basic extends OrderPaymentProviderInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderPaymentProviderCustomerDetails f5648a;
        public final OrderProviderConfig b;
        public final int c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$Basic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$Basic;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Basic> serializer() {
                return OrderPaymentProviderInfo$Basic$$serializer.f5649a;
            }
        }

        public Basic(int i, OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails, OrderProviderConfig orderProviderConfig, int i2) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfo$Basic$$serializer.f5649a.getDescriptor(), i, 7);
                throw null;
            }
            this.f5648a = orderPaymentProviderCustomerDetails;
            this.b = orderProviderConfig;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Basic)) {
                return false;
            }
            Basic basic = (Basic) obj;
            return Intrinsics.d(this.f5648a, basic.f5648a) && Intrinsics.d(this.b, basic.b) && this.c == basic.c;
        }

        public final int hashCode() {
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails = this.f5648a;
            int iHashCode = (orderPaymentProviderCustomerDetails == null ? 0 : orderPaymentProviderCustomerDetails.hashCode()) * 31;
            OrderProviderConfig orderProviderConfig = this.b;
            return ((iHashCode + (orderProviderConfig != null ? orderProviderConfig.hashCode() : 0)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Basic(customer=");
            sb.append(this.f5648a);
            sb.append(", providerConfig=");
            sb.append(this.b);
            sb.append(", providerId=");
            return b3.f(")", this.c, sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$CustomUrl;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CustomUrl extends OrderPaymentProviderInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderPaymentProviderCustomerDetails f5650a;
        public final OrderProviderConfig b;
        public final int c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$CustomUrl$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$CustomUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CustomUrl> serializer() {
                return OrderPaymentProviderInfo$CustomUrl$$serializer.f5651a;
            }
        }

        public CustomUrl(int i, OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails, OrderProviderConfig orderProviderConfig, int i2, String str) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfo$CustomUrl$$serializer.f5651a.getDescriptor(), i, 15);
                throw null;
            }
            this.f5650a = orderPaymentProviderCustomerDetails;
            this.b = orderProviderConfig;
            this.c = i2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomUrl)) {
                return false;
            }
            CustomUrl customUrl = (CustomUrl) obj;
            return Intrinsics.d(this.f5650a, customUrl.f5650a) && Intrinsics.d(this.b, customUrl.b) && this.c == customUrl.c && Intrinsics.d(this.d, customUrl.d);
        }

        public final int hashCode() {
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails = this.f5650a;
            int iHashCode = (orderPaymentProviderCustomerDetails == null ? 0 : orderPaymentProviderCustomerDetails.hashCode()) * 31;
            OrderProviderConfig orderProviderConfig = this.b;
            int iHashCode2 = (((iHashCode + (orderProviderConfig == null ? 0 : orderProviderConfig.hashCode())) * 31) + this.c) * 31;
            String str = this.d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "CustomUrl(customer=" + this.f5650a + ", providerConfig=" + this.b + ", providerId=" + this.c + ", paymentUrl=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$PhonePe;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PhonePe extends OrderPaymentProviderInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderPaymentProviderCustomerDetails f5652a;
        public final OrderProviderConfig b;
        public final int c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$PhonePe$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$PhonePe;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PhonePe> serializer() {
                return OrderPaymentProviderInfo$PhonePe$$serializer.f5653a;
            }
        }

        public PhonePe(int i, OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails, OrderProviderConfig orderProviderConfig, int i2, String str) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfo$PhonePe$$serializer.f5653a.getDescriptor(), i, 15);
                throw null;
            }
            this.f5652a = orderPaymentProviderCustomerDetails;
            this.b = orderProviderConfig;
            this.c = i2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhonePe)) {
                return false;
            }
            PhonePe phonePe = (PhonePe) obj;
            return Intrinsics.d(this.f5652a, phonePe.f5652a) && Intrinsics.d(this.b, phonePe.b) && this.c == phonePe.c && Intrinsics.d(this.d, phonePe.d);
        }

        public final int hashCode() {
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails = this.f5652a;
            int iHashCode = (orderPaymentProviderCustomerDetails == null ? 0 : orderPaymentProviderCustomerDetails.hashCode()) * 31;
            OrderProviderConfig orderProviderConfig = this.b;
            int iHashCode2 = (((iHashCode + (orderProviderConfig == null ? 0 : orderProviderConfig.hashCode())) * 31) + this.c) * 31;
            String str = this.d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "PhonePe(customer=" + this.f5652a + ", providerConfig=" + this.b + ", providerId=" + this.c + ", orderToken=" + this.d + ")";
        }
    }

    /* JADX INFO: renamed from: app.chalo.models.ordercreation.OrderPaymentProviderInfo$Serializer, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @NamedCompanion
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$Serializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends JsonContentPolymorphicSerializer<OrderPaymentProviderInfo> {

        /* JADX INFO: renamed from: app.chalo.models.ordercreation.OrderPaymentProviderInfo$Serializer$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5654a;

            static {
                int[] iArr = new int[CheckoutPaymentProvider.values().length];
                try {
                    iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CheckoutPaymentProvider.INAI.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f5654a = iArr;
            }
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
        public final DeserializationStrategy a(JsonElement element) throws JsonException {
            CheckoutPaymentProvider checkoutPaymentProvider;
            Intrinsics.i(element, "element");
            int iC = JsonElementExtensionsKt.c(JsonElementKt.g(element), "providerId");
            CheckoutPaymentProvider.INSTANCE.getClass();
            CheckoutPaymentProvider[] checkoutPaymentProviderArrValues = CheckoutPaymentProvider.values();
            int length = checkoutPaymentProviderArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    checkoutPaymentProvider = null;
                    break;
                }
                checkoutPaymentProvider = checkoutPaymentProviderArrValues[i];
                if (checkoutPaymentProvider.getId() == iC) {
                    break;
                }
                i++;
            }
            if (checkoutPaymentProvider == null) {
                checkoutPaymentProvider = CheckoutPaymentProvider.UNKNOWN;
            }
            switch (WhenMappings.f5654a[checkoutPaymentProvider.ordinal()]) {
                case 1:
                    return CustomUrl.INSTANCE.serializer();
                case 2:
                    return YesBank.INSTANCE.serializer();
                case 3:
                    return PhonePe.INSTANCE.serializer();
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return Basic.INSTANCE.serializer();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final KSerializer<OrderPaymentProviderInfo> serializer() {
            return OrderPaymentProviderInfo.INSTANCE;
        }

        private Companion() {
            super(Reflection.a(OrderPaymentProviderInfo.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$YesBank;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class YesBank extends OrderPaymentProviderInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderPaymentProviderCustomerDetails f5655a;
        public final OrderProviderConfig b;
        public final int c;
        public final OrderPaymentProviderVpaConfig d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$YesBank$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$YesBank;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<YesBank> serializer() {
                return OrderPaymentProviderInfo$YesBank$$serializer.f5656a;
            }
        }

        public YesBank(int i, OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails, OrderProviderConfig orderProviderConfig, int i2, OrderPaymentProviderVpaConfig orderPaymentProviderVpaConfig) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(OrderPaymentProviderInfo$YesBank$$serializer.f5656a.getDescriptor(), i, 15);
                throw null;
            }
            this.f5655a = orderPaymentProviderCustomerDetails;
            this.b = orderProviderConfig;
            this.c = i2;
            this.d = orderPaymentProviderVpaConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YesBank)) {
                return false;
            }
            YesBank yesBank = (YesBank) obj;
            return Intrinsics.d(this.f5655a, yesBank.f5655a) && Intrinsics.d(this.b, yesBank.b) && this.c == yesBank.c && Intrinsics.d(this.d, yesBank.d);
        }

        public final int hashCode() {
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails = this.f5655a;
            int iHashCode = (orderPaymentProviderCustomerDetails == null ? 0 : orderPaymentProviderCustomerDetails.hashCode()) * 31;
            OrderProviderConfig orderProviderConfig = this.b;
            int iHashCode2 = (((iHashCode + (orderProviderConfig == null ? 0 : orderProviderConfig.hashCode())) * 31) + this.c) * 31;
            OrderPaymentProviderVpaConfig orderPaymentProviderVpaConfig = this.d;
            return iHashCode2 + (orderPaymentProviderVpaConfig != null ? orderPaymentProviderVpaConfig.hashCode() : 0);
        }

        public final String toString() {
            return "YesBank(customer=" + this.f5655a + ", providerConfig=" + this.b + ", providerId=" + this.c + ", merchantUpiConfig=" + this.d + ")";
        }
    }
}
