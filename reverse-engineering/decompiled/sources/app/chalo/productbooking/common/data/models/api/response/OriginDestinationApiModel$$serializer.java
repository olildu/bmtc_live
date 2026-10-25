package app.chalo.productbooking.common.data.models.api.response;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/api/response/OriginDestinationApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OriginDestinationApiModel$$serializer implements GeneratedSerializer<OriginDestinationApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OriginDestinationApiModel$$serializer f8137a;
    private static final SerialDescriptor descriptor;

    static {
        OriginDestinationApiModel$$serializer originDestinationApiModel$$serializer = new OriginDestinationApiModel$$serializer();
        f8137a = originDestinationApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModel", originDestinationApiModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("fromStop", false);
        pluginGeneratedSerialDescriptor.j("toStop", false);
        pluginGeneratedSerialDescriptor.j("lastStop", false);
        pluginGeneratedSerialDescriptor.j("firstStop", false);
        pluginGeneratedSerialDescriptor.j("spf", false);
        pluginGeneratedSerialDescriptor.j("specialFeature", false);
        pluginGeneratedSerialDescriptor.j("via", false);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", false);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("tripFulfillmentId", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("additionalRouteInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OriginDestinationApiModel.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        OriginDestinationStopApiModel$$serializer originDestinationStopApiModel$$serializer = OriginDestinationStopApiModel$$serializer.f8142a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(originDestinationStopApiModel$$serializer), BuiltinSerializersKt.c(originDestinationStopApiModel$$serializer), BuiltinSerializersKt.c(originDestinationStopApiModel$$serializer), BuiltinSerializersKt.c(originDestinationStopApiModel$$serializer), BuiltinSerializersKt.c((KSerializer) lazyArr[6].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[7].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(OriginDestinationProviderConfigApiModel$$serializer.f8140a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        OriginDestinationStopApiModel originDestinationStopApiModel;
        OriginDestinationStopApiModel originDestinationStopApiModel2;
        OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel;
        String str2;
        List list;
        OriginDestinationStopApiModel originDestinationStopApiModel3;
        OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel;
        List list2;
        OriginDestinationStopApiModel originDestinationStopApiModel4;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OriginDestinationApiModel.o;
        OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            OriginDestinationStopApiModel$$serializer originDestinationStopApiModel$$serializer = OriginDestinationStopApiModel$$serializer.f8142a;
            OriginDestinationStopApiModel originDestinationStopApiModel5 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, originDestinationStopApiModel$$serializer, null);
            OriginDestinationStopApiModel originDestinationStopApiModel6 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, originDestinationStopApiModel$$serializer, null);
            OriginDestinationStopApiModel originDestinationStopApiModel7 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, originDestinationStopApiModel$$serializer, null);
            OriginDestinationStopApiModel originDestinationStopApiModel8 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, originDestinationStopApiModel$$serializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel2 = (OriginDestinationProviderConfigApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, OriginDestinationProviderConfigApiModel$$serializer.f8140a, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            originDestinationAdditionalRouteInfoApiModel = (OriginDestinationAdditionalRouteInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a, null);
            i = 16383;
            str5 = str8;
            str = str7;
            originDestinationStopApiModel3 = originDestinationStopApiModel8;
            str3 = str10;
            list2 = list3;
            originDestinationStopApiModel = originDestinationStopApiModel6;
            str4 = str9;
            originDestinationStopApiModel4 = originDestinationStopApiModel7;
            originDestinationStopApiModel2 = originDestinationStopApiModel5;
            originDestinationProviderConfigApiModel = originDestinationProviderConfigApiModel2;
            str2 = str11;
            str6 = str12;
            list = list4;
        } else {
            boolean z = true;
            int i2 = 0;
            String str13 = null;
            OriginDestinationStopApiModel originDestinationStopApiModel9 = null;
            OriginDestinationStopApiModel originDestinationStopApiModel10 = null;
            String str14 = null;
            String str15 = null;
            List list5 = null;
            OriginDestinationStopApiModel originDestinationStopApiModel11 = null;
            OriginDestinationProviderConfigApiModel originDestinationProviderConfigApiModel3 = null;
            List list6 = null;
            OriginDestinationStopApiModel originDestinationStopApiModel12 = null;
            String str16 = null;
            int i3 = 7;
            int i4 = 6;
            String str17 = null;
            String str18 = null;
            while (z) {
                String str19 = str14;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str14 = str19;
                        i2 = i2;
                        str13 = str13;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 0:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str16);
                        i2 |= 1;
                        str14 = str19;
                        str13 = str13;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 1:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str19);
                        i2 |= 2;
                        str13 = str13;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 2:
                        originDestinationStopApiModel10 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OriginDestinationStopApiModel$$serializer.f8142a, originDestinationStopApiModel10);
                        i2 |= 4;
                        str13 = str13;
                        str14 = str19;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 3:
                        originDestinationStopApiModel9 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, OriginDestinationStopApiModel$$serializer.f8142a, originDestinationStopApiModel9);
                        i2 |= 8;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 4:
                        originDestinationStopApiModel12 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, OriginDestinationStopApiModel$$serializer.f8142a, originDestinationStopApiModel12);
                        i2 |= 16;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 5:
                        originDestinationStopApiModel11 = (OriginDestinationStopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, OriginDestinationStopApiModel$$serializer.f8142a, originDestinationStopApiModel11);
                        i2 |= 32;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        i4 = 6;
                        i3 = 7;
                        break;
                    case 6:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), list6);
                        i2 |= 64;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        i3 = 7;
                        break;
                    case 7:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list5);
                        i2 |= 128;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    case 8:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str18);
                        i2 |= 256;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    case 9:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str17);
                        i2 |= 512;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    case 10:
                        originDestinationProviderConfigApiModel3 = (OriginDestinationProviderConfigApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, OriginDestinationProviderConfigApiModel$$serializer.f8140a, originDestinationProviderConfigApiModel3);
                        i2 |= 1024;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    case 11:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str15);
                        i2 |= 2048;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    case 12:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str13);
                        i2 |= 4096;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    case 13:
                        originDestinationAdditionalRouteInfoApiModel2 = (OriginDestinationAdditionalRouteInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a, originDestinationAdditionalRouteInfoApiModel2);
                        i2 |= 8192;
                        str14 = str19;
                        originDestinationStopApiModel10 = originDestinationStopApiModel10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            originDestinationStopApiModel = originDestinationStopApiModel9;
            originDestinationStopApiModel2 = originDestinationStopApiModel10;
            originDestinationAdditionalRouteInfoApiModel = originDestinationAdditionalRouteInfoApiModel2;
            str2 = str15;
            list = list5;
            originDestinationStopApiModel3 = originDestinationStopApiModel11;
            originDestinationProviderConfigApiModel = originDestinationProviderConfigApiModel3;
            list2 = list6;
            originDestinationStopApiModel4 = originDestinationStopApiModel12;
            str3 = str17;
            str4 = str18;
            str5 = str14;
            i = i2;
            str6 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OriginDestinationApiModel(i, str, str5, originDestinationStopApiModel2, originDestinationStopApiModel, originDestinationStopApiModel4, originDestinationStopApiModel3, list2, list, str4, str3, originDestinationProviderConfigApiModel, str2, str6, originDestinationAdditionalRouteInfoApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OriginDestinationApiModel value = (OriginDestinationApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OriginDestinationApiModel.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f8136a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        OriginDestinationStopApiModel$$serializer originDestinationStopApiModel$$serializer = OriginDestinationStopApiModel$$serializer.f8142a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, originDestinationStopApiModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, originDestinationStopApiModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, originDestinationStopApiModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, originDestinationStopApiModel$$serializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, OriginDestinationProviderConfigApiModel$$serializer.f8140a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, OriginDestinationAdditionalRouteInfoApiModel$$serializer.f8135a, value.n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
