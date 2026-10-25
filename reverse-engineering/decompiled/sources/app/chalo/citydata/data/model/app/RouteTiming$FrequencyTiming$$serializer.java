package app.chalo.citydata.data.model.app;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/app/RouteTiming.FrequencyTiming.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/app/RouteTiming$FrequencyTiming;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteTiming$FrequencyTiming$$serializer implements GeneratedSerializer<RouteTiming.FrequencyTiming> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteTiming$FrequencyTiming$$serializer f1721a;
    private static final SerialDescriptor descriptor;

    static {
        RouteTiming$FrequencyTiming$$serializer routeTiming$FrequencyTiming$$serializer = new RouteTiming$FrequencyTiming$$serializer();
        f1721a = routeTiming$FrequencyTiming$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.app.RouteTiming.FrequencyTiming", routeTiming$FrequencyTiming$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("startTime", false);
        pluginGeneratedSerialDescriptor.j(TypedValues.TransitionType.S_DURATION, false);
        pluginGeneratedSerialDescriptor.j("weekDayValidity", false);
        pluginGeneratedSerialDescriptor.j("tripStartTime", false);
        pluginGeneratedSerialDescriptor.j("tripEndTime", false);
        pluginGeneratedSerialDescriptor.j("frequency", false);
        pluginGeneratedSerialDescriptor.j("tripDuration", false);
        pluginGeneratedSerialDescriptor.j("tripWeekDayValidity", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{longSerializer, longSerializer, stringSerializer, longSerializer, longSerializer, longSerializer, longSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String strDecodeStringElement2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            j = jDecodeLongElement6;
            j2 = jDecodeLongElement4;
            j3 = jDecodeLongElement3;
            j4 = jDecodeLongElement;
            j5 = jDecodeLongElement2;
            j6 = jDecodeLongElement5;
            i = 255;
        } else {
            strDecodeStringElement = null;
            boolean z = true;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            String strDecodeStringElement3 = null;
            long jDecodeLongElement12 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            strDecodeStringElement2 = strDecodeStringElement3;
            j = jDecodeLongElement12;
            j2 = jDecodeLongElement7;
            j3 = jDecodeLongElement8;
            j4 = jDecodeLongElement9;
            j5 = jDecodeLongElement10;
            j6 = jDecodeLongElement11;
        }
        String str = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteTiming.FrequencyTiming(i, j4, j5, str, j3, j2, j6, j, strDecodeStringElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteTiming.FrequencyTiming value = (RouteTiming.FrequencyTiming) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RouteTiming.FrequencyTiming.Companion companion = RouteTiming.FrequencyTiming.INSTANCE;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f1719a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
