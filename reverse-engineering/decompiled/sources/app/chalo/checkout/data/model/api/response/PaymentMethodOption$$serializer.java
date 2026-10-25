package app.chalo.checkout.data.model.api.response;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/checkout/data/model/api/response/PaymentMethodOption.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/checkout/data/model/api/response/PaymentMethodOption;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PaymentMethodOption$$serializer implements GeneratedSerializer<PaymentMethodOption> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PaymentMethodOption$$serializer f1263a;
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethodOption$$serializer paymentMethodOption$$serializer = new PaymentMethodOption$$serializer();
        f1263a = paymentMethodOption$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.checkout.data.model.api.response.PaymentMethodOption", paymentMethodOption$$serializer, 12);
        pluginGeneratedSerialDescriptor.j(InMobiNetworkValues.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        pluginGeneratedSerialDescriptor.j("metaData", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("order", false);
        pluginGeneratedSerialDescriptor.j("paymentInstruments", false);
        pluginGeneratedSerialDescriptor.j("warning", false);
        pluginGeneratedSerialDescriptor.j("logoUrl", false);
        pluginGeneratedSerialDescriptor.j("providerDetails", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PaymentMethodOption.m;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(PaymentMethodOptionMetaData$$serializer.f1265a);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(IntSerializer.f18146a);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue());
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(ProviderDetails$$serializer.f1273a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, stringSerializer, booleanSerializer, booleanSerializer, kSerializerC2, kSerializerC3, stringSerializer, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        ProviderDetails providerDetails;
        String str4;
        String str5;
        List list;
        Integer num;
        PaymentMethodOptionMetaData paymentMethodOptionMetaData;
        String str6;
        boolean z;
        boolean z2;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PaymentMethodOption.m;
        int i2 = 9;
        int i3 = 8;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            PaymentMethodOptionMetaData paymentMethodOptionMetaData2 = (PaymentMethodOptionMetaData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PaymentMethodOptionMetaData$$serializer.f1265a, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            list = list2;
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            providerDetails = (ProviderDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ProviderDetails$$serializer.f1273a, null);
            paymentMethodOptionMetaData = paymentMethodOptionMetaData2;
            str4 = str10;
            num = num2;
            str6 = strDecodeStringElement2;
            i = 4095;
            z = zDecodeBooleanElement2;
            str3 = str9;
            z2 = zDecodeBooleanElement;
            str = strDecodeStringElement;
            str2 = str8;
        } else {
            String strDecodeStringElement3 = null;
            String str11 = null;
            ProviderDetails providerDetails2 = null;
            String str12 = null;
            String str13 = null;
            List list3 = null;
            String strDecodeStringElement4 = null;
            boolean z3 = true;
            int i4 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            Integer num3 = null;
            PaymentMethodOptionMetaData paymentMethodOptionMetaData3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 8;
                        break;
                    case 0:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str7);
                        i4 |= 1;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 1:
                        i4 |= 2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 2:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 3:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str11);
                        i4 |= 16;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 5:
                        paymentMethodOptionMetaData3 = (PaymentMethodOptionMetaData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PaymentMethodOptionMetaData$$serializer.f1265a, paymentMethodOptionMetaData3);
                        i4 |= 32;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 6:
                        c = 7;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 7:
                        c = 7;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num3);
                        i4 |= 128;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 8:
                        int i5 = i3;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list3);
                        i4 |= 256;
                        i3 = i5;
                        i2 = 9;
                        break;
                    case 9:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str12);
                        i4 |= 512;
                        i3 = i3;
                        break;
                    case 10:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str13);
                        i4 |= 1024;
                        i3 = i3;
                        break;
                    case 11:
                        providerDetails2 = (ProviderDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ProviderDetails$$serializer.f1273a, providerDetails2);
                        i4 |= 2048;
                        i3 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement3;
            str2 = str7;
            str3 = str11;
            i = i4;
            providerDetails = providerDetails2;
            str4 = str12;
            str5 = str13;
            list = list3;
            num = num3;
            paymentMethodOptionMetaData = paymentMethodOptionMetaData3;
            str6 = strDecodeStringElement4;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaymentMethodOption(i, str2, str, z2, z, str3, paymentMethodOptionMetaData, str6, num, list, str4, str5, providerDetails);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PaymentMethodOption value = (PaymentMethodOption) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PaymentMethodOption.m;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f1262a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, PaymentMethodOptionMetaData$$serializer.f1265a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, ProviderDetails$$serializer.f1273a, value.l);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
