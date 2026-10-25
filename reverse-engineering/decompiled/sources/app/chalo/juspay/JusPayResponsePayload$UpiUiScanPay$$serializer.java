package app.chalo.juspay;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/juspay/JusPayResponsePayload.UpiUiScanPay.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$UpiUiScanPay;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class JusPayResponsePayload$UpiUiScanPay$$serializer implements GeneratedSerializer<JusPayResponsePayload.UpiUiScanPay> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JusPayResponsePayload$UpiUiScanPay$$serializer f3995a;
    private static final SerialDescriptor descriptor;

    static {
        JusPayResponsePayload$UpiUiScanPay$$serializer jusPayResponsePayload$UpiUiScanPay$$serializer = new JusPayResponsePayload$UpiUiScanPay$$serializer();
        f3995a = jusPayResponsePayload$UpiUiScanPay$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.juspay.JusPayResponsePayload.UpiUiScanPay", jusPayResponsePayload$UpiUiScanPay$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("jusPayAction", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("gatewayTransactionId", false);
        pluginGeneratedSerialDescriptor.j("gatewayResponseMessage", false);
        pluginGeneratedSerialDescriptor.j("gatewayResponseCode", false);
        pluginGeneratedSerialDescriptor.j("actionPerformed", false);
        pluginGeneratedSerialDescriptor.j("accountReferenceId", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.LABEL_PAYEE_NAME, false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("transactionTimestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            i = 2047;
            str = str22;
            str3 = str20;
            str6 = str19;
            str4 = str18;
            str8 = str16;
            str2 = str21;
            str7 = str17;
            str9 = str15;
            str11 = str14;
            str10 = str13;
        } else {
            boolean z = true;
            int i3 = 0;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        break;
                    case 0:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str12);
                        i3 |= 1;
                        i2 = 10;
                        break;
                    case 1:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str32);
                        i3 |= 2;
                        i2 = 10;
                        break;
                    case 2:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str31);
                        i3 |= 4;
                        i2 = 10;
                        break;
                    case 3:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str30);
                        i3 |= 8;
                        i2 = 10;
                        break;
                    case 4:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str29);
                        i3 |= 16;
                        i2 = 10;
                        break;
                    case 5:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str26);
                        i3 |= 32;
                        i2 = 10;
                        break;
                    case 6:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str28);
                        i3 |= 64;
                        i2 = 10;
                        break;
                    case 7:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str25);
                        i3 |= 128;
                        i2 = 10;
                        break;
                    case 8:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str24);
                        i3 |= 256;
                        i2 = 10;
                        break;
                    case 9:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str23);
                        i3 |= 512;
                        i2 = 10;
                        break;
                    case 10:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str27);
                        i3 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str23;
            str2 = str24;
            str3 = str25;
            str4 = str26;
            str5 = str27;
            str6 = str28;
            str7 = str29;
            str8 = str30;
            str9 = str31;
            str10 = str12;
            str11 = str32;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new JusPayResponsePayload.UpiUiScanPay(i, str10, str11, str9, str8, str7, str4, str6, str3, str2, str, str5);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JusPayResponsePayload.UpiUiScanPay value = (JusPayResponsePayload.UpiUiScanPay) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        JusPayResponsePayload.UpiUiScanPay.Companion companion = JusPayResponsePayload.UpiUiScanPay.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f3990a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.l);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
