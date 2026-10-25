package app.chalo.models;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/CreateCardRechargeOrderRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/CreateCardRechargeOrderRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CreateCardRechargeOrderRequestApiModel$$serializer implements GeneratedSerializer<CreateCardRechargeOrderRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreateCardRechargeOrderRequestApiModel$$serializer f5581a;
    private static final SerialDescriptor descriptor;

    static {
        CreateCardRechargeOrderRequestApiModel$$serializer createCardRechargeOrderRequestApiModel$$serializer = new CreateCardRechargeOrderRequestApiModel$$serializer();
        f5581a = createCardRechargeOrderRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.CreateCardRechargeOrderRequestApiModel", createCardRechargeOrderRequestApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("cardNo", false);
        pluginGeneratedSerialDescriptor.j("cardProps", false);
        pluginGeneratedSerialDescriptor.j("paymentProps", false);
        pluginGeneratedSerialDescriptor.j("cardType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, CardProps$$serializer.f5574a, PaymentProps$$serializer.f5591a, BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        CardProps cardProps;
        PaymentProps paymentProps;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            CardProps cardProps2 = (CardProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CardProps$$serializer.f5574a, null);
            PaymentProps paymentProps2 = (PaymentProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PaymentProps$$serializer.f5591a, null);
            str = strDecodeStringElement2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, null);
            paymentProps = paymentProps2;
            cardProps = cardProps2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            CardProps cardProps3 = null;
            PaymentProps paymentProps3 = null;
            String str3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cardProps3 = (CardProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CardProps$$serializer.f5574a, cardProps3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    paymentProps3 = (PaymentProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PaymentProps$$serializer.f5591a, paymentProps3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            cardProps = cardProps3;
            paymentProps = paymentProps3;
            str2 = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateCardRechargeOrderRequestApiModel(i, str, cardProps, paymentProps, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CreateCardRechargeOrderRequestApiModel value = (CreateCardRechargeOrderRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f5580a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, CardProps$$serializer.f5574a, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, PaymentProps$$serializer.f5591a, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
