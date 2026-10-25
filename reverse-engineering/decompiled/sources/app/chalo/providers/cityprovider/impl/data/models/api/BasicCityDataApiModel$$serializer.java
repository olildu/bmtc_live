package app.chalo.providers.cityprovider.impl.data.models.api;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/providers/cityprovider/impl/data/models/api/BasicCityDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/BasicCityDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class BasicCityDataApiModel$$serializer implements GeneratedSerializer<BasicCityDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BasicCityDataApiModel$$serializer f8835a;
    private static final SerialDescriptor descriptor;

    static {
        BasicCityDataApiModel$$serializer basicCityDataApiModel$$serializer = new BasicCityDataApiModel$$serializer();
        f8835a = basicCityDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.providers.cityprovider.impl.data.models.api.BasicCityDataApiModel", basicCityDataApiModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("beta_mode", true);
        pluginGeneratedSerialDescriptor.j("cityDisplayName", false);
        pluginGeneratedSerialDescriptor.j("cityId", false);
        pluginGeneratedSerialDescriptor.j("isComingSoon", true);
        pluginGeneratedSerialDescriptor.j("isDisabled", true);
        pluginGeneratedSerialDescriptor.j("polyBound", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BasicCityDataApiModel.g;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, stringSerializer, stringSerializer, kSerializerC2, kSerializerC3, kSerializerC4};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        String str;
        String str2;
        Boolean bool2;
        Boolean bool3;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BasicCityDataApiModel.g;
        int i2 = 3;
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            bool3 = bool7;
            bool2 = bool6;
            i = 63;
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            bool = bool5;
        } else {
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                        break;
                    case 0:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.f18123a, bool4);
                        i3 |= 1;
                        i2 = 3;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.f18123a, bool8);
                        i3 |= 8;
                        break;
                    case 4:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool9);
                        i3 |= 16;
                        break;
                    case 5:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            bool = bool4;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            bool2 = bool8;
            bool3 = bool9;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BasicCityDataApiModel(i, bool, str, str2, bool2, bool3, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        BasicCityDataApiModel value = (BasicCityDataApiModel) obj;
        Intrinsics.i(value, "value");
        Boolean bool = value.f8834a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BasicCityDataApiModel.g;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.f18123a, bool);
        }
        String str = value.b;
        List list = value.f;
        Boolean bool2 = value.e;
        Boolean bool3 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || bool3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.f18123a, bool3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || bool2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
