package app.chalo.titoridedetail.data.app;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/titoridedetail/data/app/TapInDetailAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/titoridedetail/data/app/TapInDetailAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TapInDetailAppModel$$serializer implements GeneratedSerializer<TapInDetailAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TapInDetailAppModel$$serializer f9674a;
    private static final SerialDescriptor descriptor;

    static {
        TapInDetailAppModel$$serializer tapInDetailAppModel$$serializer = new TapInDetailAppModel$$serializer();
        f9674a = tapInDetailAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.titoridedetail.data.app.TapInDetailAppModel", tapInDetailAppModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("tapId", false);
        pluginGeneratedSerialDescriptor.j("tapInGroupNo", false);
        pluginGeneratedSerialDescriptor.j("activationTSInSec", false);
        pluginGeneratedSerialDescriptor.j("conductorValidationStaticPayload", false);
        pluginGeneratedSerialDescriptor.j("tapInTimestampInMillis", false);
        pluginGeneratedSerialDescriptor.j("tapInRouteId", false);
        pluginGeneratedSerialDescriptor.j("tapInStopId", false);
        pluginGeneratedSerialDescriptor.j("tapInTripNo", false);
        pluginGeneratedSerialDescriptor.j("tapInWaybillNo", false);
        pluginGeneratedSerialDescriptor.j("vehicleNo", false);
        pluginGeneratedSerialDescriptor.j("dropOffStopId", true);
        pluginGeneratedSerialDescriptor.j("tapInStopName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, longSerializer, longSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, kSerializerC, kSerializerC2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        long j;
        long j2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        long j3;
        long j4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str3 = strDecodeStringElement2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str2 = str9;
            str8 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            i = 4095;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
            j4 = jDecodeLongElement4;
        } else {
            long jDecodeLongElement5 = 0;
            boolean z = true;
            int i3 = 0;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 11;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 11;
                        break;
                    case 1:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 11;
                        break;
                    case 2:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        break;
                    case 8:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i3 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        break;
                    case 10:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str11);
                        i3 |= 1024;
                        break;
                    case 11:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str10);
                        i3 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str10;
            str2 = str11;
            str3 = strDecodeStringElement;
            j = jDecodeLongElement5;
            j2 = jDecodeLongElement6;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            str7 = strDecodeStringElement11;
            str8 = strDecodeStringElement12;
            j3 = jDecodeLongElement7;
            j4 = jDecodeLongElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TapInDetailAppModel(i, str3, j2, j3, str4, j, str5, str6, str7, j4, str8, str2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TapInDetailAppModel value = (TapInDetailAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f9673a;
        String str2 = value.l;
        String str3 = value.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
