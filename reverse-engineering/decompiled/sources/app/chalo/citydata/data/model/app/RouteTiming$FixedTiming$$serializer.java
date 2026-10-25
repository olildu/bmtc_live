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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/app/RouteTiming.FixedTiming.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/app/RouteTiming$FixedTiming;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteTiming$FixedTiming$$serializer implements GeneratedSerializer<RouteTiming.FixedTiming> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteTiming$FixedTiming$$serializer f1720a;
    private static final SerialDescriptor descriptor;

    static {
        RouteTiming$FixedTiming$$serializer routeTiming$FixedTiming$$serializer = new RouteTiming$FixedTiming$$serializer();
        f1720a = routeTiming$FixedTiming$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.app.RouteTiming.FixedTiming", routeTiming$FixedTiming$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("startTime", false);
        pluginGeneratedSerialDescriptor.j(TypedValues.TransitionType.S_DURATION, false);
        pluginGeneratedSerialDescriptor.j("weekDayValidity", false);
        pluginGeneratedSerialDescriptor.j("tripStartTime", false);
        pluginGeneratedSerialDescriptor.j("tripDuration", false);
        pluginGeneratedSerialDescriptor.j("tripWeekDayValidity", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{longSerializer, longSerializer, stringSerializer, longSerializer, longSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            j = jDecodeLongElement4;
            j2 = jDecodeLongElement3;
            j3 = jDecodeLongElement;
            j4 = jDecodeLongElement2;
            i = 63;
        } else {
            strDecodeStringElement = null;
            boolean z = true;
            int i2 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            String strDecodeStringElement3 = null;
            long jDecodeLongElement8 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement3;
            j = jDecodeLongElement8;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
            j4 = jDecodeLongElement7;
            i = i2;
        }
        String str = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteTiming.FixedTiming(i, j3, j4, str, j2, j, strDecodeStringElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteTiming.FixedTiming value = (RouteTiming.FixedTiming) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RouteTiming.FixedTiming.Companion companion = RouteTiming.FixedTiming.INSTANCE;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f1719a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
