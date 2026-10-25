package app.chalo.models.ordercreation;

import com.google.firebase.analytics.FirebaseAnalytics;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/ordercreation/CreateOrderResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/ordercreation/CreateOrderResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CreateOrderResponseApiModel$$serializer implements GeneratedSerializer<CreateOrderResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreateOrderResponseApiModel$$serializer f5636a;
    private static final SerialDescriptor descriptor;

    static {
        CreateOrderResponseApiModel$$serializer createOrderResponseApiModel$$serializer = new CreateOrderResponseApiModel$$serializer();
        f5636a = createOrderResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.ordercreation.CreateOrderResponseApiModel", createOrderResponseApiModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("bookingInfo", false);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.CURRENCY, false);
        pluginGeneratedSerialDescriptor.j("countryId", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.ORDER_ID_CAMEL, false);
        pluginGeneratedSerialDescriptor.j("chaloOrderId", false);
        pluginGeneratedSerialDescriptor.j("paymentProviderInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(OrderBookingInfo$$serializer.f5641a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{IntSerializer.f18146a, stringSerializer, kSerializerC, stringSerializer, stringSerializer, stringSerializer, stringSerializer, OrderPaymentProviderInfo.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        OrderPaymentProviderInfo orderPaymentProviderInfo;
        int i;
        String str;
        OrderBookingInfo orderBookingInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            OrderBookingInfo orderBookingInfo2 = (OrderBookingInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OrderBookingInfo$$serializer.f5641a, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            orderPaymentProviderInfo = (OrderPaymentProviderInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, OrderPaymentProviderInfo.INSTANCE, null);
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str2 = strDecodeStringElement2;
            str3 = strDecodeStringElement3;
            orderBookingInfo = orderBookingInfo2;
            str = strDecodeStringElement;
            i = 255;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            String strDecodeStringElement6 = null;
            OrderBookingInfo orderBookingInfo3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int i2 = 0;
            OrderPaymentProviderInfo orderPaymentProviderInfo2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        orderBookingInfo3 = (OrderBookingInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OrderBookingInfo$$serializer.f5641a, orderBookingInfo3);
                        i2 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        orderPaymentProviderInfo2 = (OrderPaymentProviderInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, OrderPaymentProviderInfo.INSTANCE, orderPaymentProviderInfo2);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            orderPaymentProviderInfo = orderPaymentProviderInfo2;
            i = i2;
            str = strDecodeStringElement6;
            orderBookingInfo = orderBookingInfo3;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
        }
        int i3 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateOrderResponseApiModel(i, i3, str, orderBookingInfo, str2, str3, str4, str5, orderPaymentProviderInfo);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CreateOrderResponseApiModel value = (CreateOrderResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f5635a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, OrderBookingInfo$$serializer.f5641a, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, OrderPaymentProviderInfo.INSTANCE, value.h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
