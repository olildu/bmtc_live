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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfoAppModel$ProviderPaymentUrl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer implements GeneratedSerializer<OrderPaymentProviderInfoAppModel.ProviderPaymentUrl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer f5660a;
    private static final SerialDescriptor descriptor;

    static {
        OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer orderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer = new OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer();
        f5660a = orderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel.ProviderPaymentUrl", orderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("payProvider", false);
        pluginGeneratedSerialDescriptor.j("paymentUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.f;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), StringSerializer.f18170a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        CheckoutPaymentProvider checkoutPaymentProvider;
        CheckoutPaymentProvider checkoutPaymentProvider2;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.f;
        CheckoutPaymentProvider checkoutPaymentProvider3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            checkoutPaymentProvider = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            checkoutPaymentProvider2 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            CheckoutPaymentProvider checkoutPaymentProvider4 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    checkoutPaymentProvider3 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), checkoutPaymentProvider3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    checkoutPaymentProvider4 = (CheckoutPaymentProvider) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), checkoutPaymentProvider4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            checkoutPaymentProvider = checkoutPaymentProvider3;
            checkoutPaymentProvider2 = checkoutPaymentProvider4;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OrderPaymentProviderInfoAppModel.ProviderPaymentUrl(i, checkoutPaymentProvider, checkoutPaymentProvider2, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OrderPaymentProviderInfoAppModel.ProviderPaymentUrl value = (OrderPaymentProviderInfoAppModel.ProviderPaymentUrl) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.Companion companion = OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) OrderPaymentProviderInfoAppModel.b[0].getValue(), value.f5657a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.f[1].getValue(), value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
