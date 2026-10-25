package app.chalo.models.ordercreation;

import app.chalo.models.CheckoutPaymentProvider;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer implements GeneratedSerializer<OrderPaymentProviderInfoAppModel.ProviderConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer f5659a;
    private static final SerialDescriptor descriptor;

    static {
        OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer orderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer = new OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer();
        f5659a = orderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel.ProviderConfigAppModel", orderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("payProvider", false);
        pluginGeneratedSerialDescriptor.j("customerConfig", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j("merchantKey", false);
        pluginGeneratedSerialDescriptor.j("orderToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), BuiltinSerializersKt.c(OrderPaymentProviderCustomerDetailsAppModel$$serializer.f5647a), BuiltinSerializersKt.c(stringSerializer), stringSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        CheckoutPaymentProvider checkoutPaymentProvider;
        CheckoutPaymentProvider checkoutPaymentProvider2;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        String str3;
        String str4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.j;
        int i2 = 6;
        CheckoutPaymentProvider checkoutPaymentProvider3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CheckoutPaymentProvider checkoutPaymentProvider4 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            CheckoutPaymentProvider checkoutPaymentProvider5 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel2 = (OrderPaymentProviderCustomerDetailsAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OrderPaymentProviderCustomerDetailsAppModel$$serializer.f5647a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            checkoutPaymentProvider2 = checkoutPaymentProvider5;
            checkoutPaymentProvider = checkoutPaymentProvider4;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str2 = str6;
            str3 = str5;
            str4 = strDecodeStringElement;
            orderPaymentProviderCustomerDetailsAppModel = orderPaymentProviderCustomerDetailsAppModel2;
            i = 127;
        } else {
            int i3 = 1;
            boolean z = true;
            int i4 = 0;
            String str7 = null;
            String str8 = null;
            CheckoutPaymentProvider checkoutPaymentProvider6 = null;
            OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel3 = null;
            String str9 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 1;
                        break;
                    case 0:
                        checkoutPaymentProvider3 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), checkoutPaymentProvider3);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 1;
                        break;
                    case 1:
                        checkoutPaymentProvider6 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), checkoutPaymentProvider6);
                        i4 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        orderPaymentProviderCustomerDetailsAppModel3 = (OrderPaymentProviderCustomerDetailsAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OrderPaymentProviderCustomerDetailsAppModel$$serializer.f5647a, orderPaymentProviderCustomerDetailsAppModel3);
                        i4 |= 4;
                        i2 = 6;
                        break;
                    case 3:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str9);
                        i4 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str8);
                        i4 |= 32;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str7);
                        i4 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str7;
            str2 = str8;
            checkoutPaymentProvider = checkoutPaymentProvider3;
            checkoutPaymentProvider2 = checkoutPaymentProvider6;
            orderPaymentProviderCustomerDetailsAppModel = orderPaymentProviderCustomerDetailsAppModel3;
            str3 = str9;
            str4 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OrderPaymentProviderInfoAppModel.ProviderConfigAppModel(i, checkoutPaymentProvider, checkoutPaymentProvider2, orderPaymentProviderCustomerDetailsAppModel, str3, str4, str2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel value = (OrderPaymentProviderInfoAppModel.ProviderConfigAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.Companion companion = OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) OrderPaymentProviderInfoAppModel.b[0].getValue(), value.f5657a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.j[1].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, OrderPaymentProviderCustomerDetailsAppModel$$serializer.f5647a, value.e);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
