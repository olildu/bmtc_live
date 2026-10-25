package app.chalo.citydata.data.model.api.request;

import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/api/request/RoutesDataRequestDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RoutesDataRequestDataApiModel$$serializer implements GeneratedSerializer<RoutesDataRequestDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RoutesDataRequestDataApiModel$$serializer f1645a;
    private static final SerialDescriptor descriptor;

    static {
        RoutesDataRequestDataApiModel$$serializer routesDataRequestDataApiModel$$serializer = new RoutesDataRequestDataApiModel$$serializer();
        f1645a = routesDataRequestDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.api.request.RoutesDataRequestDataApiModel", routesDataRequestDataApiModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, false);
        pluginGeneratedSerialDescriptor.j("routeIdsToVersionMap", false);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.LOCATION, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RoutesDataRequestMetaQueryParameterApiModel$$serializer.f1649a, RoutesDataRequestDataApiModel.d[1].getValue(), BuiltinSerializersKt.c(RoutesDataRequestLocationApiModel$$serializer.f1647a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        RoutesDataRequestMetaQueryParameterApiModel routesDataRequestMetaQueryParameterApiModel;
        Map map;
        RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RoutesDataRequestDataApiModel.d;
        RoutesDataRequestMetaQueryParameterApiModel routesDataRequestMetaQueryParameterApiModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            routesDataRequestMetaQueryParameterApiModel = (RoutesDataRequestMetaQueryParameterApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, RoutesDataRequestMetaQueryParameterApiModel$$serializer.f1649a, null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            routesDataRequestLocationApiModel = (RoutesDataRequestLocationApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RoutesDataRequestLocationApiModel$$serializer.f1647a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    routesDataRequestMetaQueryParameterApiModel2 = (RoutesDataRequestMetaQueryParameterApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, RoutesDataRequestMetaQueryParameterApiModel$$serializer.f1649a, routesDataRequestMetaQueryParameterApiModel2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    routesDataRequestLocationApiModel2 = (RoutesDataRequestLocationApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RoutesDataRequestLocationApiModel$$serializer.f1647a, routesDataRequestLocationApiModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            routesDataRequestMetaQueryParameterApiModel = routesDataRequestMetaQueryParameterApiModel2;
            map = map2;
            routesDataRequestLocationApiModel = routesDataRequestLocationApiModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RoutesDataRequestDataApiModel(i, routesDataRequestMetaQueryParameterApiModel, map, routesDataRequestLocationApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RoutesDataRequestDataApiModel value = (RoutesDataRequestDataApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RoutesDataRequestDataApiModel.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, RoutesDataRequestMetaQueryParameterApiModel$$serializer.f1649a, value.f1644a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, RoutesDataRequestLocationApiModel$$serializer.f1647a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
