package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketEtaResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketEtaResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RealtimeSocketEtaResponseApiModel$$serializer implements GeneratedSerializer<RealtimeSocketEtaResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RealtimeSocketEtaResponseApiModel$$serializer f4287a;
    private static final SerialDescriptor descriptor;

    static {
        RealtimeSocketEtaResponseApiModel$$serializer realtimeSocketEtaResponseApiModel$$serializer = new RealtimeSocketEtaResponseApiModel$$serializer();
        f4287a = realtimeSocketEtaResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.frameworklivetracking.data.model.api.response.RealtimeSocketEtaResponseApiModel", realtimeSocketEtaResponseApiModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("eta", false);
        pluginGeneratedSerialDescriptor.j("vNo", false);
        pluginGeneratedSerialDescriptor.j("minEta", true);
        pluginGeneratedSerialDescriptor.j("maxEta", true);
        pluginGeneratedSerialDescriptor.j("tS", false);
        pluginGeneratedSerialDescriptor.j("lSId", true);
        pluginGeneratedSerialDescriptor.j("fSi", true);
        pluginGeneratedSerialDescriptor.j("isHalted", true);
        pluginGeneratedSerialDescriptor.j("dist", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.f18146a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(intSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{intSerializer, stringSerializer, longSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, BooleanSerializer.f18123a, kSerializerC};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        Integer num;
        boolean zDecodeBooleanElement;
        int i;
        long j;
        String str;
        String str2;
        String str3;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, null);
            i = 511;
            j = jDecodeLongElement3;
            str = strDecodeStringElement;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            Integer num2 = null;
            long jDecodeLongElement6 = 0;
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
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num2);
                        i2 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            j = jDecodeLongElement6;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            j2 = jDecodeLongElement4;
            j3 = jDecodeLongElement5;
        }
        int i3 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RealtimeSocketEtaResponseApiModel(i, i3, str, j2, j3, j, str2, str3, zDecodeBooleanElement, num);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RealtimeSocketEtaResponseApiModel value = (RealtimeSocketEtaResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        int i = value.f4286a;
        Integer num = value.i;
        boolean z = value.h;
        String str = value.g;
        String str2 = value.f;
        long j = value.d;
        long j2 = value.c;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j2 != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j);
        }
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
