package app.chalo.models.validation;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/validation/RegularBusSlBleConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/validation/RegularBusSlBleConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RegularBusSlBleConfig$$serializer implements GeneratedSerializer<RegularBusSlBleConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RegularBusSlBleConfig$$serializer f5703a;
    private static final SerialDescriptor descriptor;

    static {
        RegularBusSlBleConfig$$serializer regularBusSlBleConfig$$serializer = new RegularBusSlBleConfig$$serializer();
        f5703a = regularBusSlBleConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.validation.RegularBusSlBleConfig", regularBusSlBleConfig$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("isEnabled", true);
        pluginGeneratedSerialDescriptor.j("qrFirstBleEntryPolicy", true);
        pluginGeneratedSerialDescriptor.j("minAppVer", true);
        pluginGeneratedSerialDescriptor.j("maxAppVer", true);
        pluginGeneratedSerialDescriptor.j("blacklistedAppVer", true);
        pluginGeneratedSerialDescriptor.j("showFeedbackPercentage", true);
        pluginGeneratedSerialDescriptor.j("timeoutToShowQrValidationOption", true);
        pluginGeneratedSerialDescriptor.j("showQrOptionAfterNoBlePermAttemptsThreshold", true);
        pluginGeneratedSerialDescriptor.j("bleTutorialCountThreshold", true);
        pluginGeneratedSerialDescriptor.j("isNewPayloadSchemeEnabled", true);
        pluginGeneratedSerialDescriptor.j("isQRAsBackupMethodEnabled", true);
        pluginGeneratedSerialDescriptor.j("twoWayBLECommPilotConfig", true);
        pluginGeneratedSerialDescriptor.j("titoTapinPollingDelay", true);
        pluginGeneratedSerialDescriptor.j("isTitoTapinPollingEnabled", true);
        pluginGeneratedSerialDescriptor.j("minAppVerForRefacBleVal", true);
        pluginGeneratedSerialDescriptor.j("maxAppVerForRefacBleVal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RegularBusSlBleConfig.q;
        KSerializer kSerializerC = BuiltinSerializersKt.c(QrFirstBleEntryPolicy$$serializer.f5695a);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(TwoWayBLECommPilotConfig$$serializer.f5707a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{booleanSerializer, kSerializerC, intSerializer, intSerializer, kSerializerC2, FloatSerializer.f18142a, longSerializer, intSerializer, intSerializer, booleanSerializer, booleanSerializer, kSerializerC3, longSerializer, booleanSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        TwoWayBLECommPilotConfig twoWayBLECommPilotConfig;
        List list;
        QrFirstBleEntryPolicy qrFirstBleEntryPolicy;
        boolean z;
        int i;
        int i2;
        float f;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        long j;
        int i5;
        int i6;
        long j2;
        int i7;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RegularBusSlBleConfig.q;
        int i8 = 10;
        int i9 = 5;
        int i10 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            QrFirstBleEntryPolicy qrFirstBleEntryPolicy2 = (QrFirstBleEntryPolicy) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, QrFirstBleEntryPolicy$$serializer.f5695a, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 5);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            TwoWayBLECommPilotConfig twoWayBLECommPilotConfig2 = (TwoWayBLECommPilotConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, TwoWayBLECommPilotConfig$$serializer.f5707a, null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            z = zDecodeBooleanElement;
            i2 = iDecodeIntElement2;
            f = fDecodeFloatElement;
            qrFirstBleEntryPolicy = qrFirstBleEntryPolicy2;
            i3 = iDecodeIntElement3;
            z2 = zDecodeBooleanElement4;
            z3 = zDecodeBooleanElement3;
            z4 = zDecodeBooleanElement2;
            i4 = iDecodeIntElement4;
            j = jDecodeLongElement;
            i5 = iDecodeIntElement5;
            i6 = iDecodeIntElement6;
            twoWayBLECommPilotConfig = twoWayBLECommPilotConfig2;
            i = 65535;
            j2 = jDecodeLongElement2;
            list = list2;
        } else {
            boolean z5 = true;
            int i11 = 0;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            TwoWayBLECommPilotConfig twoWayBLECommPilotConfig3 = null;
            List list3 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            float fDecodeFloatElement2 = 0.0f;
            int iDecodeIntElement11 = 0;
            boolean zDecodeBooleanElement8 = false;
            int iDecodeIntElement12 = 0;
            QrFirstBleEntryPolicy qrFirstBleEntryPolicy3 = null;
            while (z5) {
                int i12 = i10;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i10 = 4;
                        i9 = 5;
                        break;
                    case 0:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i11 |= 1;
                        i10 = 4;
                        i8 = 10;
                        i9 = 5;
                        break;
                    case 1:
                        qrFirstBleEntryPolicy3 = (QrFirstBleEntryPolicy) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, QrFirstBleEntryPolicy$$serializer.f5695a, qrFirstBleEntryPolicy3);
                        i11 |= 2;
                        i10 = 4;
                        i8 = 10;
                        i9 = 5;
                        break;
                    case 2:
                        i7 = i12;
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i11 |= 4;
                        i10 = i7;
                        i8 = 10;
                        i9 = 5;
                        break;
                    case 3:
                        i7 = i12;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i11 |= 8;
                        i10 = i7;
                        i8 = 10;
                        i9 = 5;
                        break;
                    case 4:
                        i7 = i12;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i12].getValue(), list3);
                        i11 |= 16;
                        i10 = i7;
                        i8 = 10;
                        i9 = 5;
                        break;
                    case 5:
                        int i13 = i9;
                        fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, i13);
                        i11 |= 32;
                        i9 = i13;
                        i10 = i12;
                        break;
                    case 6:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i11 |= 64;
                        i10 = i12;
                        i9 = 5;
                        break;
                    case 7:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i11 |= 128;
                        i10 = i12;
                        i9 = 5;
                        break;
                    case 8:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i11 |= 256;
                        i10 = i12;
                        i9 = 5;
                        break;
                    case 9:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i11 |= 512;
                        i10 = i12;
                        i9 = 5;
                        break;
                    case 10:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i8);
                        i11 |= 1024;
                        i10 = i12;
                        i9 = 5;
                        break;
                    case 11:
                        twoWayBLECommPilotConfig3 = (TwoWayBLECommPilotConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, TwoWayBLECommPilotConfig$$serializer.f5707a, twoWayBLECommPilotConfig3);
                        i11 |= 2048;
                        i10 = i12;
                        i9 = 5;
                        break;
                    case 12:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
                        i11 |= 4096;
                        i10 = i12;
                        break;
                    case 13:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i11 |= 8192;
                        i10 = i12;
                        break;
                    case 14:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
                        i11 |= 16384;
                        i10 = i12;
                        break;
                    case 15:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i11 |= 32768;
                        i10 = i12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement11;
            twoWayBLECommPilotConfig = twoWayBLECommPilotConfig3;
            list = list3;
            qrFirstBleEntryPolicy = qrFirstBleEntryPolicy3;
            z = zDecodeBooleanElement8;
            i = i11;
            i2 = iDecodeIntElement12;
            f = fDecodeFloatElement2;
            i3 = iDecodeIntElement7;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            z4 = zDecodeBooleanElement7;
            i4 = iDecodeIntElement8;
            j = jDecodeLongElement3;
            i5 = iDecodeIntElement9;
            i6 = iDecodeIntElement10;
            j2 = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RegularBusSlBleConfig(i, z, qrFirstBleEntryPolicy, i2, i3, list, f, j, i4, i5, z4, z3, twoWayBLECommPilotConfig, j2, z2, i6, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:88:0x013d  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        int i;
        int i2;
        RegularBusSlBleConfig value = (RegularBusSlBleConfig) obj;
        Intrinsics.i(value, "value");
        int i3 = value.p;
        int i4 = value.o;
        boolean z = value.n;
        long j = value.m;
        TwoWayBLECommPilotConfig twoWayBLECommPilotConfig = value.l;
        boolean z2 = value.k;
        boolean z3 = value.j;
        int i5 = value.i;
        int i6 = value.h;
        long j2 = value.g;
        float f = value.f;
        List list = value.e;
        int i7 = value.d;
        int i8 = value.c;
        QrFirstBleEntryPolicy qrFirstBleEntryPolicy = value.b;
        boolean z4 = value.f5702a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RegularBusSlBleConfig.q;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || qrFirstBleEntryPolicy != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, QrFirstBleEntryPolicy$$serializer.f5695a, qrFirstBleEntryPolicy);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i8 != Integer.MAX_VALUE) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || i7 != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, i7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || Float.compare(f, 1.0f) != 0) {
            compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 5, f);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j2 != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || i6 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, i6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || i5 != 1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, i5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || twoWayBLECommPilotConfig != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, TwoWayBLECommPilotConfig$$serializer.f5707a, twoWayBLECommPilotConfig);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || j != 10000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 12, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 13, z);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
            if (i != Integer.MAX_VALUE) {
            }
            i = i4;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
                if (i2 != -1) {
                }
                i2 = i3;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            i2 = i3;
            i2 = i3;
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 15, i2);
            i2 = i3;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        i = i4;
        i = i4;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 14, i);
        i = i4;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
            if (i2 != -1) {
            }
            i2 = i3;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        i2 = i3;
        i2 = i3;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 15, i2);
        i2 = i3;
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
