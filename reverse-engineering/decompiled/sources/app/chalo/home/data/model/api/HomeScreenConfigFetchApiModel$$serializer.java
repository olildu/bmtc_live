package app.chalo.home.data.model.api;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/model/api/HomeScreenConfigFetchApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/model/api/HomeScreenConfigFetchApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class HomeScreenConfigFetchApiModel$$serializer implements GeneratedSerializer<HomeScreenConfigFetchApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HomeScreenConfigFetchApiModel$$serializer f2887a;
    private static final SerialDescriptor descriptor;

    static {
        HomeScreenConfigFetchApiModel$$serializer homeScreenConfigFetchApiModel$$serializer = new HomeScreenConfigFetchApiModel$$serializer();
        f2887a = homeScreenConfigFetchApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel", homeScreenConfigFetchApiModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("response", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(BooleanSerializer.f18123a), BuiltinSerializersKt.c(HomeScreenConfigResponseApiModel$$serializer.f2889a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        HomeScreenConfigResponseApiModel homeScreenConfigResponseApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.f18123a, null);
            homeScreenConfigResponseApiModel = (HomeScreenConfigResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HomeScreenConfigResponseApiModel$$serializer.f2889a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            HomeScreenConfigResponseApiModel homeScreenConfigResponseApiModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.f18123a, bool2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    homeScreenConfigResponseApiModel2 = (HomeScreenConfigResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HomeScreenConfigResponseApiModel$$serializer.f2889a, homeScreenConfigResponseApiModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            bool = bool2;
            homeScreenConfigResponseApiModel = homeScreenConfigResponseApiModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HomeScreenConfigFetchApiModel(i, bool, homeScreenConfigResponseApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        HomeScreenConfigFetchApiModel value = (HomeScreenConfigFetchApiModel) obj;
        Intrinsics.i(value, "value");
        HomeScreenConfigResponseApiModel homeScreenConfigResponseApiModel = value.b;
        Boolean bool = value.f2886a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(bool, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || homeScreenConfigResponseApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, HomeScreenConfigResponseApiModel$$serializer.f2889a, homeScreenConfigResponseApiModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
