package app.chalo.citydata.repository.local.room.entity;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/repository/local/room/entity/RoutEntityTimingModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RoutEntityTimingModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RoutEntityTimingModel$$serializer implements GeneratedSerializer<RoutEntityTimingModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RoutEntityTimingModel$$serializer f1782a;
    private static final SerialDescriptor descriptor;

    static {
        RoutEntityTimingModel$$serializer routEntityTimingModel$$serializer = new RoutEntityTimingModel$$serializer();
        f1782a = routEntityTimingModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.repository.local.room.entity.RoutEntityTimingModel", routEntityTimingModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("isFrequency", false);
        pluginGeneratedSerialDescriptor.j("startTime", true);
        pluginGeneratedSerialDescriptor.j("frequencyDetails", true);
        pluginGeneratedSerialDescriptor.j("weekDayValidity", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.f18123a, BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(RouteEntityTimeTableWithFrequencyModel$$serializer.f1791a), StringSerializer.f18170a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        Long l;
        RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, null);
            RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel2 = (RouteEntityTimeTableWithFrequencyModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RouteEntityTimeTableWithFrequencyModel$$serializer.f1791a, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            routeEntityTimeTableWithFrequencyModel = routeEntityTimeTableWithFrequencyModel2;
            l = l2;
            i = 15;
        } else {
            boolean z = true;
            zDecodeBooleanElement = false;
            Long l3 = null;
            RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel3 = null;
            String strDecodeStringElement2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    routeEntityTimeTableWithFrequencyModel3 = (RouteEntityTimeTableWithFrequencyModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RouteEntityTimeTableWithFrequencyModel$$serializer.f1791a, routeEntityTimeTableWithFrequencyModel3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            l = l3;
            routeEntityTimeTableWithFrequencyModel = routeEntityTimeTableWithFrequencyModel3;
            strDecodeStringElement = strDecodeStringElement2;
        }
        boolean z2 = zDecodeBooleanElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RoutEntityTimingModel(i, z2, l, routeEntityTimeTableWithFrequencyModel, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RoutEntityTimingModel value = (RoutEntityTimingModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.f1781a;
        RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel = value.c;
        Long l = value.b;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || routeEntityTimeTableWithFrequencyModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, RouteEntityTimeTableWithFrequencyModel$$serializer.f1791a, routeEntityTimeTableWithFrequencyModel);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
