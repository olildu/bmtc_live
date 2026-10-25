package app.chalo.productbooking.common.data.models.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/app/OriginDestinationAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OriginDestinationAppModel$$serializer implements GeneratedSerializer<OriginDestinationAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OriginDestinationAppModel$$serializer f8191a;
    private static final SerialDescriptor descriptor;

    static {
        OriginDestinationAppModel$$serializer originDestinationAppModel$$serializer = new OriginDestinationAppModel$$serializer();
        f8191a = originDestinationAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel", originDestinationAppModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("fromStop", false);
        pluginGeneratedSerialDescriptor.j("toStop", false);
        pluginGeneratedSerialDescriptor.j("firstStop", false);
        pluginGeneratedSerialDescriptor.j("lastStop", false);
        pluginGeneratedSerialDescriptor.j("spf", false);
        pluginGeneratedSerialDescriptor.j("specialFeature", false);
        pluginGeneratedSerialDescriptor.j("via", false);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", false);
        pluginGeneratedSerialDescriptor.j("routeProviderConfig", true);
        pluginGeneratedSerialDescriptor.j("tripFulfillmentId", true);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("additionalRouteInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OriginDestinationAppModel.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        return new KSerializer[]{stringSerializer, stringSerializer, stopAppModel$$serializer, stopAppModel$$serializer, BuiltinSerializersKt.c(stopAppModel$$serializer), BuiltinSerializersKt.c(stopAppModel$$serializer), lazyArr[6].getValue(), lazyArr[7].getValue(), BuiltinSerializersKt.c(stringSerializer), lazyArr[9].getValue(), BuiltinSerializersKt.c(RouteProviderConfigAppModel$$serializer.f8228a), BuiltinSerializersKt.c(stringSerializer), lazyArr[12].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String str;
        List list;
        String str2;
        List list2;
        StopAppModel stopAppModel3;
        StopAppModel stopAppModel4;
        ChaloTransitMode chaloTransitMode;
        RouteProviderConfigAppModel routeProviderConfigAppModel;
        RouteNamingSchemeType routeNamingSchemeType;
        String str3;
        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel;
        String str4;
        int i2;
        int i3;
        int i4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OriginDestinationAppModel.o;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
            StopAppModel stopAppModel5 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, stopAppModel$$serializer, null);
            StopAppModel stopAppModel6 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, stopAppModel$$serializer, null);
            StopAppModel stopAppModel7 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stopAppModel$$serializer, null);
            StopAppModel stopAppModel8 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stopAppModel$$serializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            RouteNamingSchemeType routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            RouteProviderConfigAppModel routeProviderConfigAppModel2 = (RouteProviderConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, RouteProviderConfigAppModel$$serializer.f8228a, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            i = 16383;
            chaloTransitMode = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            str4 = strDecodeStringElement2;
            originDestinationAdditionalRouteInfoAppModel = (OriginDestinationAdditionalRouteInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            routeNamingSchemeType = routeNamingSchemeType2;
            stopAppModel3 = stopAppModel8;
            stopAppModel = stopAppModel6;
            str = str5;
            stopAppModel4 = stopAppModel7;
            stopAppModel2 = stopAppModel5;
            str3 = strDecodeStringElement3;
            str2 = str6;
            list2 = list4;
            list = list3;
            routeProviderConfigAppModel = routeProviderConfigAppModel2;
        } else {
            int i5 = 13;
            int i6 = 0;
            StopAppModel stopAppModel9 = null;
            OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel2 = null;
            StopAppModel stopAppModel10 = null;
            String str7 = null;
            List list5 = null;
            String str8 = null;
            List list6 = null;
            StopAppModel stopAppModel11 = null;
            String strDecodeStringElement4 = null;
            boolean z = true;
            int i7 = 9;
            int i8 = 7;
            int i9 = 6;
            StopAppModel stopAppModel12 = null;
            ChaloTransitMode chaloTransitMode2 = null;
            RouteProviderConfigAppModel routeProviderConfigAppModel3 = null;
            RouteNamingSchemeType routeNamingSchemeType3 = null;
            while (z) {
                int i10 = i5;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = i6;
                        z = false;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        i6 = i2;
                        i5 = 13;
                        break;
                    case 0:
                        i2 = i6 | 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        i6 = i2;
                        i5 = 13;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i6 | 2;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        i6 = i2;
                        i5 = 13;
                        break;
                    case 2:
                        stopAppModel10 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StopAppModel$$serializer.f1728a, stopAppModel10);
                        i3 = i6 | 4;
                        i6 = i3;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        break;
                    case 3:
                        stopAppModel9 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, StopAppModel$$serializer.f1728a, stopAppModel9);
                        i3 = i6 | 8;
                        i6 = i3;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        break;
                    case 4:
                        stopAppModel12 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StopAppModel$$serializer.f1728a, stopAppModel12);
                        i3 = i6 | 16;
                        i6 = i3;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        break;
                    case 5:
                        stopAppModel11 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StopAppModel$$serializer.f1728a, stopAppModel11);
                        i3 = i6 | 32;
                        i6 = i3;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i9 = 6;
                        i8 = 7;
                        i7 = 9;
                        break;
                    case 6:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i9, (DeserializationStrategy) lazyArr[i9].getValue(), list5);
                        i6 |= 64;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i8 = 7;
                        i7 = 9;
                        break;
                    case 7:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), list6);
                        i6 |= 128;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i7 = 9;
                        break;
                    case 8:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str7);
                        i6 |= 256;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        i7 = 9;
                        break;
                    case 9:
                        strDecodeStringElement = strDecodeStringElement;
                        routeNamingSchemeType3 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), routeNamingSchemeType3);
                        i6 |= 512;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        break;
                    case 10:
                        routeProviderConfigAppModel3 = (RouteProviderConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, RouteProviderConfigAppModel$$serializer.f8228a, routeProviderConfigAppModel3);
                        i4 = i6 | 1024;
                        i6 = i4;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        break;
                    case 11:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str8);
                        i4 = i6 | 2048;
                        i6 = i4;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        break;
                    case 12:
                        chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), chaloTransitMode2);
                        i4 = i6 | 4096;
                        i6 = i4;
                        originDestinationAdditionalRouteInfoAppModel2 = originDestinationAdditionalRouteInfoAppModel2;
                        strDecodeStringElement = strDecodeStringElement;
                        i5 = 13;
                        break;
                    case 13:
                        originDestinationAdditionalRouteInfoAppModel2 = (OriginDestinationAdditionalRouteInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, (DeserializationStrategy) lazyArr[i10].getValue(), originDestinationAdditionalRouteInfoAppModel2);
                        i6 |= 8192;
                        i5 = i10;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            stopAppModel = stopAppModel9;
            stopAppModel2 = stopAppModel10;
            str = str7;
            list = list5;
            str2 = str8;
            list2 = list6;
            stopAppModel3 = stopAppModel11;
            stopAppModel4 = stopAppModel12;
            chaloTransitMode = chaloTransitMode2;
            routeProviderConfigAppModel = routeProviderConfigAppModel3;
            routeNamingSchemeType = routeNamingSchemeType3;
            str3 = strDecodeStringElement4;
            originDestinationAdditionalRouteInfoAppModel = originDestinationAdditionalRouteInfoAppModel2;
            str4 = strDecodeStringElement;
        }
        int i11 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OriginDestinationAppModel(i11, str4, str3, stopAppModel2, stopAppModel, stopAppModel4, stopAppModel3, list, list2, str, routeNamingSchemeType, routeProviderConfigAppModel, str2, chaloTransitMode, originDestinationAdditionalRouteInfoAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OriginDestinationAppModel value = (OriginDestinationAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OriginDestinationAppModel.o;
        String str = value.f8190a;
        String str2 = value.l;
        RouteProviderConfigAppModel routeProviderConfigAppModel = value.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, stopAppModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, stopAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stopAppModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stopAppModel$$serializer, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), value.h);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || routeProviderConfigAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, RouteProviderConfigAppModel$$serializer.f8228a, routeProviderConfigAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
