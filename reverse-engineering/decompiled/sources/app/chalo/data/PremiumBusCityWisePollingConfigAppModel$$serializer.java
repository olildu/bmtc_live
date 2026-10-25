package app.chalo.data;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/data/PremiumBusCityWisePollingConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/data/PremiumBusCityWisePollingConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusCityWisePollingConfigAppModel$$serializer implements GeneratedSerializer<PremiumBusCityWisePollingConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusCityWisePollingConfigAppModel$$serializer f2377a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusCityWisePollingConfigAppModel$$serializer premiumBusCityWisePollingConfigAppModel$$serializer = new PremiumBusCityWisePollingConfigAppModel$$serializer();
        f2377a = premiumBusCityWisePollingConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.data.PremiumBusCityWisePollingConfigAppModel", premiumBusCityWisePollingConfigAppModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("pollingFrequencyDiffFactor", true);
        pluginGeneratedSerialDescriptor.j("pollingFrequencyMinThreshold", true);
        pluginGeneratedSerialDescriptor.j("runningLateStatusThresholdInSec", true);
        pluginGeneratedSerialDescriptor.j("onTimeBufferThresholdInSec", true);
        pluginGeneratedSerialDescriptor.j("busArrivedEarlyThresholdInSec", true);
        pluginGeneratedSerialDescriptor.j("delayedEtaThresholdInMins", true);
        pluginGeneratedSerialDescriptor.j("trackingAllowedStartWindowInMillis", true);
        pluginGeneratedSerialDescriptor.j("systemRescheduleAckBufferInMillis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{FloatSerializer.f18142a, longSerializer, longSerializer, longSerializer, longSerializer, longSerializer, longSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        float fDecodeFloatElement;
        int i;
        long jDecodeLongElement;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jDecodeLongElement2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 0);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            i = 255;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            j = jDecodeLongElement6;
            j2 = jDecodeLongElement3;
            j3 = jDecodeLongElement4;
            j4 = jDecodeLongElement5;
            j5 = jDecodeLongElement7;
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
        } else {
            fDecodeFloatElement = 0.0f;
            boolean z = true;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            long jDecodeLongElement12 = 0;
            long jDecodeLongElement13 = 0;
            int i2 = 0;
            long jDecodeLongElement14 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement14 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        jDecodeLongElement13 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            jDecodeLongElement = jDecodeLongElement14;
            j = jDecodeLongElement8;
            j2 = jDecodeLongElement9;
            j3 = jDecodeLongElement10;
            j4 = jDecodeLongElement11;
            j5 = jDecodeLongElement12;
            jDecodeLongElement2 = jDecodeLongElement13;
        }
        float f = fDecodeFloatElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusCityWisePollingConfigAppModel(i, f, j2, j3, j4, j, j5, jDecodeLongElement, jDecodeLongElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusCityWisePollingConfigAppModel value = (PremiumBusCityWisePollingConfigAppModel) obj;
        Intrinsics.i(value, "value");
        long j = value.h;
        long j2 = value.g;
        long j3 = value.f;
        long j4 = value.e;
        long j5 = value.d;
        long j6 = value.c;
        long j7 = value.b;
        float f = value.f2376a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        int i = 0;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, i, f);
        } else if (Float.compare(f, 0.25f) != 0) {
            i = 0;
            compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, i, f);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || j7 != 120000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, j7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j6 != 360) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j5 != 300) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j4 != 300) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || j3 != 2) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j2 != 1800000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || j != 300000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, j);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
