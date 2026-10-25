package app.chalo.livetracking.tripplanner.data.models.app;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerItineraryAppResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerItineraryAppResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerItineraryAppResponseModel$$serializer implements GeneratedSerializer<TripPlannerItineraryAppResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerItineraryAppResponseModel$$serializer f4664a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerItineraryAppResponseModel$$serializer tripPlannerItineraryAppResponseModel$$serializer = new TripPlannerItineraryAppResponseModel$$serializer();
        f4664a = tripPlannerItineraryAppResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel", tripPlannerItineraryAppResponseModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("localId", false);
        pluginGeneratedSerialDescriptor.j("distanceInMeters", false);
        pluginGeneratedSerialDescriptor.j("totalFare", false);
        pluginGeneratedSerialDescriptor.j("travelTimeInSeconds", false);
        pluginGeneratedSerialDescriptor.j("incompleteFare", false);
        pluginGeneratedSerialDescriptor.j("legs", false);
        pluginGeneratedSerialDescriptor.j("serviceTypeFilter", false);
        pluginGeneratedSerialDescriptor.j("rank", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TripPlannerItineraryAppResponseModel.i;
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        return new KSerializer[]{StringSerializer.f18170a, BuiltinSerializersKt.c(doubleSerializer), BuiltinSerializersKt.c(doubleSerializer), BuiltinSerializersKt.c(doubleSerializer), BooleanSerializer.f18123a, lazyArr[5].getValue(), lazyArr[6].getValue(), IntSerializer.f18146a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        List list;
        List list2;
        Double d;
        Double d2;
        boolean z;
        int i;
        String str;
        Double d3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerItineraryAppResponseModel.i;
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
            Double d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, doubleSerializer, null);
            Double d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, null);
            Double d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            str = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            d = d6;
            z = zDecodeBooleanElement;
            d2 = d5;
            i = 255;
            list2 = list3;
            d3 = d4;
        } else {
            boolean z2 = true;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            List list4 = null;
            List list5 = null;
            Double d7 = null;
            String strDecodeStringElement2 = null;
            Double d8 = null;
            boolean zDecodeBooleanElement2 = false;
            Double d9 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        d8 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.f18137a, d8);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        d9 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d9);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DoubleSerializer.f18137a, d7);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list5);
                        i3 |= 32;
                        break;
                    case 6:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list4);
                        i3 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            list = list4;
            list2 = list5;
            d = d7;
            d2 = d9;
            z = zDecodeBooleanElement2;
            i = i3;
            str = strDecodeStringElement2;
            d3 = d8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerItineraryAppResponseModel(i, str, d3, d2, d, z, list2, list, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerItineraryAppResponseModel value = (TripPlannerItineraryAppResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerItineraryAppResponseModel.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f4663a);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, doubleSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
