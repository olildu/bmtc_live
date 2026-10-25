package app.chalo.models.validation;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/validation/TwoWayBLECommPilotConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/validation/TwoWayBLECommPilotConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TwoWayBLECommPilotConfig$$serializer implements GeneratedSerializer<TwoWayBLECommPilotConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TwoWayBLECommPilotConfig$$serializer f5707a;
    private static final SerialDescriptor descriptor;

    static {
        TwoWayBLECommPilotConfig$$serializer twoWayBLECommPilotConfig$$serializer = new TwoWayBLECommPilotConfig$$serializer();
        f5707a = twoWayBLECommPilotConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.validation.TwoWayBLECommPilotConfig", twoWayBLECommPilotConfig$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("isEnabled", true);
        pluginGeneratedSerialDescriptor.j("stopOperationsDelay", true);
        pluginGeneratedSerialDescriptor.j("connectionReqMaxRetryCount", true);
        pluginGeneratedSerialDescriptor.j("oneWayBroadcastMaxRetryCount", true);
        pluginGeneratedSerialDescriptor.j("duplexConnDataTransferMaxRetryCount", true);
        pluginGeneratedSerialDescriptor.j("retryActiveModeBroadcastDelay", true);
        pluginGeneratedSerialDescriptor.j("retryConnectionRequestDelay", true);
        pluginGeneratedSerialDescriptor.j("eventsToLog", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TwoWayBLECommPilotConfig.i;
        LongSerializer longSerializer = LongSerializer.f18151a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BooleanSerializer.f18123a, longSerializer, intSerializer, intSerializer, intSerializer, longSerializer, longSerializer, lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        List list;
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TwoWayBLECommPilotConfig.i;
        int i5 = 6;
        int i6 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            j = jDecodeLongElement3;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement3;
            i4 = iDecodeIntElement;
            i = 255;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z = true;
            zDecodeBooleanElement = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            List list2 = null;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            int iDecodeIntElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 6;
                        break;
                    case 0:
                        i6 |= 1;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i5 = 6;
                        break;
                    case 1:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 6;
                        break;
                    case 2:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i5);
                        i6 |= 64;
                        break;
                    case 7:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), list2);
                        i6 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            i = i6;
            i2 = iDecodeIntElement6;
            j = jDecodeLongElement4;
            i3 = iDecodeIntElement4;
            i4 = iDecodeIntElement5;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        boolean z2 = zDecodeBooleanElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TwoWayBLECommPilotConfig(i, z2, j2, i4, i2, i3, j3, j, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TwoWayBLECommPilotConfig value = (TwoWayBLECommPilotConfig) obj;
        Intrinsics.i(value, "value");
        List list = value.h;
        long j = value.g;
        long j2 = value.f;
        int i = value.e;
        int i2 = value.d;
        int i3 = value.c;
        long j3 = value.b;
        boolean z = value.f5706a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TwoWayBLECommPilotConfig.i;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || j3 != 5000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i3 != 3) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || i2 != 3) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || j2 != 1000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j != 1000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
