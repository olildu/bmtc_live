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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer implements GeneratedSerializer<OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer f5658a;
    private static final SerialDescriptor descriptor;

    static {
        OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer orderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer = new OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer();
        f5658a = orderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel", orderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("payProvider", false);
        pluginGeneratedSerialDescriptor.j("vpa", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.FIELD_CODE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.h;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        CheckoutPaymentProvider checkoutPaymentProvider;
        CheckoutPaymentProvider checkoutPaymentProvider2;
        String str;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.h;
        int i2 = 0;
        CheckoutPaymentProvider checkoutPaymentProvider3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CheckoutPaymentProvider checkoutPaymentProvider4 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            CheckoutPaymentProvider checkoutPaymentProvider5 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            checkoutPaymentProvider2 = checkoutPaymentProvider5;
            checkoutPaymentProvider = checkoutPaymentProvider4;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str = strDecodeStringElement3;
            i = 31;
        } else {
            int i3 = 1;
            int i4 = 0;
            CheckoutPaymentProvider checkoutPaymentProvider6 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (i3 != 0) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        checkoutPaymentProvider6 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), checkoutPaymentProvider6);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    checkoutPaymentProvider3 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), checkoutPaymentProvider3);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            checkoutPaymentProvider = checkoutPaymentProvider3;
            checkoutPaymentProvider2 = checkoutPaymentProvider6;
            str = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement5;
            strDecodeStringElement2 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel(i, checkoutPaymentProvider, checkoutPaymentProvider2, str, strDecodeStringElement, strDecodeStringElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel value = (OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.Companion companion = OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) OrderPaymentProviderInfoAppModel.b[0].getValue(), value.f5657a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.h[1].getValue(), value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
