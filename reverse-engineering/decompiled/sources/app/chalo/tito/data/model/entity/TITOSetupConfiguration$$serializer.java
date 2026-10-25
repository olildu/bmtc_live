package app.chalo.tito.data.model.entity;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/tito/data/model/entity/TITOSetupConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/tito/data/model/entity/TITOSetupConfiguration;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TITOSetupConfiguration$$serializer implements GeneratedSerializer<TITOSetupConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TITOSetupConfiguration$$serializer f9649a;
    private static final SerialDescriptor descriptor;

    static {
        TITOSetupConfiguration$$serializer tITOSetupConfiguration$$serializer = new TITOSetupConfiguration$$serializer();
        f9649a = tITOSetupConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.tito.data.model.entity.TITOSetupConfiguration", tITOSetupConfiguration$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("isTITOEnabled", true);
        pluginGeneratedSerialDescriptor.j("isUnifiedTitoFlowEnabled", true);
        pluginGeneratedSerialDescriptor.j("periodicSyncInterval", true);
        pluginGeneratedSerialDescriptor.j("tapInScanToneRetryTimeout", true);
        pluginGeneratedSerialDescriptor.j("titoValidationTimeout", true);
        pluginGeneratedSerialDescriptor.j("tapInDisclaimer", true);
        pluginGeneratedSerialDescriptor.j("tapOutDisclaimer", true);
        pluginGeneratedSerialDescriptor.j("minAppVer", true);
        pluginGeneratedSerialDescriptor.j("maxAppVer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, longSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        int iDecodeIntElement;
        String str;
        String str2;
        int iDecodeIntElement2;
        long j;
        boolean z;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            i = 511;
            j = jDecodeLongElement3;
            z = zDecodeBooleanElement2;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
        } else {
            String strDecodeStringElement3 = null;
            boolean z2 = true;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement3 = false;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            String strDecodeStringElement4 = null;
            zDecodeBooleanElement = false;
            int iDecodeIntElement4 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        i2 |= 1;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i2 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            iDecodeIntElement = iDecodeIntElement4;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            iDecodeIntElement2 = iDecodeIntElement3;
            j = jDecodeLongElement4;
            z = zDecodeBooleanElement3;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        boolean z3 = zDecodeBooleanElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TITOSetupConfiguration(i, z3, z, j2, j3, j, str2, str, iDecodeIntElement, iDecodeIntElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TITOSetupConfiguration value = (TITOSetupConfiguration) obj;
        Intrinsics.i(value, "value");
        int i = value.i;
        int i2 = value.h;
        String str = value.g;
        String str2 = value.f;
        long j = value.e;
        long j2 = value.d;
        long j3 = value.c;
        boolean z = value.b;
        boolean z2 = value.f9648a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j3 != 43200000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j2 != 8000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j != 43200000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || i2 != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || i != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
