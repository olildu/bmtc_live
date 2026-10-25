package app.chalo.mTicketing.validation;

import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Map;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/mTicketing/validation/MTicketReceiptData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/mTicketing/validation/MTicketReceiptData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicketReceiptData$$serializer implements GeneratedSerializer<MTicketReceiptData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicketReceiptData$$serializer f5393a;
    private static final SerialDescriptor descriptor;

    static {
        MTicketReceiptData$$serializer mTicketReceiptData$$serializer = new MTicketReceiptData$$serializer();
        f5393a = mTicketReceiptData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.mTicketing.validation.MTicketReceiptData", mTicketReceiptData$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("productId", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("punchTime", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("vehicleNo", false);
        pluginGeneratedSerialDescriptor.j("conductorId", false);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("activationTimeStamp", false);
        pluginGeneratedSerialDescriptor.j("endStopId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) MTicketReceiptData.n[9].getValue());
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerC, stringSerializer, longSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Map map;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String strDecodeStringElement;
        long j;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketReceiptData.n;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
            map = map2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            str8 = strDecodeStringElement10;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str6 = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            str4 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            str7 = strDecodeStringElement9;
            j = jDecodeLongElement3;
            i = 8191;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
        } else {
            int i2 = 12;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean z = true;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            int i3 = 0;
            Map map3 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 12;
                        break;
                    case 1:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 12;
                        break;
                    case 2:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 12;
                        break;
                    case 3:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 12;
                        break;
                    case 4:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 12;
                        break;
                    case 5:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 12;
                        break;
                    case 6:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 12;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 12;
                        break;
                    case 8:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 12;
                        break;
                    case 9:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), map3);
                        i3 |= 512;
                        i2 = 12;
                        break;
                    case 10:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        break;
                    case 11:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
                        i3 |= 2048;
                        break;
                    case 12:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map3;
            str = strDecodeStringElement2;
            i = i3;
            str2 = strDecodeStringElement17;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement14;
            str8 = strDecodeStringElement15;
            strDecodeStringElement = strDecodeStringElement16;
            j = jDecodeLongElement4;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicketReceiptData(i, str, str2, j2, j3, str3, str4, str5, str6, str7, map, str8, j, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MTicketReceiptData value = (MTicketReceiptData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketReceiptData.n;
        String str = value.f5392a;
        String str2 = value.m;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 11, value.l);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
