package app.chalo.electricitybill.data.model.apimodel.request;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/electricitybill/data/model/apimodel/request/ElectricityBillPaymentCreateOrderRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/request/ElectricityBillPaymentCreateOrderRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ElectricityBillPaymentCreateOrderRequestApiModel$$serializer implements GeneratedSerializer<ElectricityBillPaymentCreateOrderRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ElectricityBillPaymentCreateOrderRequestApiModel$$serializer f2529a;
    private static final SerialDescriptor descriptor;

    static {
        ElectricityBillPaymentCreateOrderRequestApiModel$$serializer electricityBillPaymentCreateOrderRequestApiModel$$serializer = new ElectricityBillPaymentCreateOrderRequestApiModel$$serializer();
        f2529a = electricityBillPaymentCreateOrderRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.electricitybill.data.model.apimodel.request.ElectricityBillPaymentCreateOrderRequestApiModel", electricityBillPaymentCreateOrderRequestApiModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("appVer", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.SALT_FIELD_DEVICE_ID, false);
        pluginGeneratedSerialDescriptor.j("userId", false);
        pluginGeneratedSerialDescriptor.j("paymentProps", true);
        pluginGeneratedSerialDescriptor.j("billProps", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, IntSerializer.f18146a, stringSerializer, stringSerializer, PaymentProps$$serializer.f2531a, EbillProps$$serializer.f2527a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        PaymentProps paymentProps;
        EbillProps ebillProps;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            PaymentProps paymentProps2 = (PaymentProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PaymentProps$$serializer.f2531a, null);
            str = strDecodeStringElement;
            ebillProps = (EbillProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, EbillProps$$serializer.f2527a, null);
            str3 = strDecodeStringElement3;
            paymentProps = paymentProps2;
            str2 = strDecodeStringElement2;
            i = iDecodeIntElement;
            i2 = 63;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            PaymentProps paymentProps3 = null;
            EbillProps ebillProps2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        paymentProps3 = (PaymentProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PaymentProps$$serializer.f2531a, paymentProps3);
                        i3 |= 16;
                        break;
                    case 5:
                        ebillProps2 = (EbillProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, EbillProps$$serializer.f2527a, ebillProps2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            i2 = i3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            paymentProps = paymentProps3;
            ebillProps = ebillProps2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ElectricityBillPaymentCreateOrderRequestApiModel(i2, str, i, str2, str3, paymentProps, ebillProps);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ElectricityBillPaymentCreateOrderRequestApiModel value = (ElectricityBillPaymentCreateOrderRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f2528a;
        PaymentProps paymentProps = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(paymentProps, new PaymentProps())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, PaymentProps$$serializer.f2531a, paymentProps);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, EbillProps$$serializer.f2527a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
