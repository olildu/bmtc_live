package app.chalo.ondc.model.api.response;

import app.chalo.productbooking.common.data.models.api.response.OriginDestinationAdditionalRouteInfoApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationAdditionalRouteInfoApiModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationProviderConfigApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationProviderConfigApiModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationStopApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationStopApiModel$$serializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ondc/model/api/response/OndcMetroRouteSearchApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ondc/model/api/response/OndcMetroRouteSearchApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OndcMetroRouteSearchApiModel$$serializer implements GeneratedSerializer<OndcMetroRouteSearchApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OndcMetroRouteSearchApiModel$$serializer f6753a;
    private static final SerialDescriptor descriptor;

    static {
        OndcMetroRouteSearchApiModel$$serializer ondcMetroRouteSearchApiModel$$serializer = new OndcMetroRouteSearchApiModel$$serializer();
        f6753a = ondcMetroRouteSearchApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ondc.model.api.response.OndcMetroRouteSearchApiModel", ondcMetroRouteSearchApiModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("lastStop", false);
        pluginGeneratedSerialDescriptor.j("firstStop", false);
        pluginGeneratedSerialDescriptor.j("specialFeature", false);
        pluginGeneratedSerialDescriptor.j("via", false);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("additionalRouteInfo", false);
        pluginGeneratedSerialDescriptor.j("provider", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OndcMetroRouteSearchApiModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        OriginDestinationStopApiModel$$serializer originDestinationStopApiModel$$serializer = OriginDestinationStopApiModel$$serializer.f8142a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(originDestinationStopApiModel$$serializer), BuiltinSerializersKt.c(originDestinationStopApiModel$$serializer), BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a), BuiltinSerializersKt.c(OriginDestinationProviderConfigApiModel$$serializer.f8140a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel;
        OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel;
        String str;
        String str2;
        List list;
        String str3;
        OriginDestinationStopApiModel originDestinationStopApiModel;
        OriginDestinationStopApiModel originDestinationStopApiModel2;
        String str4;
        String str5;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcMetroRouteSearchApiModel.k;
        int i2 = 9;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            OriginDestinationStopApiModel$$serializer originDestinationStopApiModel$$serializer = OriginDestinationStopApiModel$$serializer.f8142a;
            OriginDestinationStopApiModel originDestinationStopApiModel3 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, originDestinationStopApiModel$$serializer, null);
            OriginDestinationStopApiModel originDestinationStopApiModel4 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, originDestinationStopApiModel$$serializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel2 = (OriginDestinationAdditionalRouteInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a, null);
            list = list2;
            str = str11;
            originDestinationProviderConfigApiModel = (OriginDestinationProviderConfigApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, OriginDestinationProviderConfigApiModel$$serializer.f8140a, null);
            originDestinationAdditionalRouteInfoApiModel = originDestinationAdditionalRouteInfoApiModel2;
            str3 = str10;
            str2 = str9;
            originDestinationStopApiModel = originDestinationStopApiModel4;
            i = 1023;
            originDestinationStopApiModel2 = originDestinationStopApiModel3;
            str5 = str8;
            str4 = str7;
        } else {
            int i3 = 4;
            boolean z = true;
            int i4 = 0;
            OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel2 = null;
            OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel3 = null;
            String str12 = null;
            String str13 = null;
            List list3 = null;
            String str14 = null;
            OriginDestinationStopApiModel originDestinationStopApiModel5 = null;
            OriginDestinationStopApiModel originDestinationStopApiModel6 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 4;
                        break;
                    case 0:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str6);
                        i4 |= 1;
                        i2 = 9;
                        i3 = 4;
                        break;
                    case 1:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str15);
                        i4 |= 2;
                        i2 = 9;
                        i3 = 4;
                        break;
                    case 2:
                        originDestinationStopApiModel6 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OriginDestinationStopApiModel$$serializer.f8142a, originDestinationStopApiModel6);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 4;
                        break;
                    case 3:
                        originDestinationStopApiModel5 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, OriginDestinationStopApiModel$$serializer.f8142a, originDestinationStopApiModel5);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 4;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list3);
                        i4 |= 16;
                        i2 = 9;
                        break;
                    case 5:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str13);
                        i4 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str14);
                        i4 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str12);
                        i4 |= 128;
                        i2 = 9;
                        break;
                    case 8:
                        originDestinationAdditionalRouteInfoApiModel3 = (OriginDestinationAdditionalRouteInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a, originDestinationAdditionalRouteInfoApiModel3);
                        i4 |= 256;
                        i2 = 9;
                        break;
                    case 9:
                        originDestinationProviderConfigApiModel2 = (OriginDestinationProviderConfigApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, OriginDestinationProviderConfigApiModel$$serializer.f8140a, originDestinationProviderConfigApiModel2);
                        i4 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            originDestinationProviderConfigApiModel = originDestinationProviderConfigApiModel2;
            originDestinationAdditionalRouteInfoApiModel = originDestinationAdditionalRouteInfoApiModel3;
            str = str12;
            str2 = str13;
            list = list3;
            str3 = str14;
            originDestinationStopApiModel = originDestinationStopApiModel5;
            originDestinationStopApiModel2 = originDestinationStopApiModel6;
            str4 = str6;
            str5 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OndcMetroRouteSearchApiModel(i, str4, str5, originDestinationStopApiModel2, originDestinationStopApiModel, list, str2, str3, str, originDestinationAdditionalRouteInfoApiModel, originDestinationProviderConfigApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OndcMetroRouteSearchApiModel value = (OndcMetroRouteSearchApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcMetroRouteSearchApiModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f6752a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        OriginDestinationStopApiModel$$serializer originDestinationStopApiModel$$serializer = OriginDestinationStopApiModel$$serializer.f8142a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, originDestinationStopApiModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, originDestinationStopApiModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, OriginDestinationProviderConfigApiModel$$serializer.f8140a, value.j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
