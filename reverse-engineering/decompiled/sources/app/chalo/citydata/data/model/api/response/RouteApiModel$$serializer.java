package app.chalo.citydata.data.model.api.response;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/api/response/RouteApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteApiModel$$serializer implements GeneratedSerializer<RouteApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteApiModel$$serializer f1669a;
    private static final SerialDescriptor descriptor;

    static {
        RouteApiModel$$serializer routeApiModel$$serializer = new RouteApiModel$$serializer();
        f1669a = routeApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.api.response.RouteApiModel", routeApiModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("routeId", true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("liveData", true);
        pluginGeneratedSerialDescriptor.j("staticData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(IntSerializer.f18146a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(RouteLiveDataApiModel$$serializer.f1677a), BuiltinSerializersKt.c(RouteStaticDataApiModel$$serializer.f1681a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Integer num;
        String str;
        String str2;
        RouteLiveDataApiModel routeLiveDataApiModel;
        RouteStaticDataApiModel routeStaticDataApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            num = num3;
            routeLiveDataApiModel = (RouteLiveDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RouteLiveDataApiModel$$serializer.f1677a, null);
            routeStaticDataApiModel = (RouteStaticDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RouteStaticDataApiModel$$serializer.f1681a, null);
            str2 = str4;
            str = str3;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            RouteLiveDataApiModel routeLiveDataApiModel2 = null;
            RouteStaticDataApiModel routeStaticDataApiModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, num2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str6);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    routeLiveDataApiModel2 = (RouteLiveDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RouteLiveDataApiModel$$serializer.f1677a, routeLiveDataApiModel2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    routeStaticDataApiModel2 = (RouteStaticDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RouteStaticDataApiModel$$serializer.f1681a, routeStaticDataApiModel2);
                    i2 |= 16;
                }
            }
            i = i2;
            num = num2;
            str = str5;
            str2 = str6;
            routeLiveDataApiModel = routeLiveDataApiModel2;
            routeStaticDataApiModel = routeStaticDataApiModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteApiModel(i, num, str, str2, routeLiveDataApiModel, routeStaticDataApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteApiModel value = (RouteApiModel) obj;
        Intrinsics.i(value, "value");
        RouteStaticDataApiModel routeStaticDataApiModel = value.e;
        RouteLiveDataApiModel routeLiveDataApiModel = value.d;
        String str = value.c;
        String str2 = value.b;
        Integer num = value.f1668a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || routeLiveDataApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, RouteLiveDataApiModel$$serializer.f1677a, routeLiveDataApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || routeStaticDataApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, RouteStaticDataApiModel$$serializer.f1681a, routeStaticDataApiModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
