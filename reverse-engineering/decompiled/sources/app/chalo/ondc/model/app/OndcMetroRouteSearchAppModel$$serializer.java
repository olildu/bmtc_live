package app.chalo.ondc.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.RouteProviderConfigAppModel;
import app.chalo.productbooking.common.data.models.app.RouteProviderConfigAppModel$$serializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ondc/model/app/OndcMetroRouteSearchAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ondc/model/app/OndcMetroRouteSearchAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OndcMetroRouteSearchAppModel$$serializer implements GeneratedSerializer<OndcMetroRouteSearchAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OndcMetroRouteSearchAppModel$$serializer f6767a;
    private static final SerialDescriptor descriptor;

    static {
        OndcMetroRouteSearchAppModel$$serializer ondcMetroRouteSearchAppModel$$serializer = new OndcMetroRouteSearchAppModel$$serializer();
        f6767a = ondcMetroRouteSearchAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel", ondcMetroRouteSearchAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("firstStop", false);
        pluginGeneratedSerialDescriptor.j("lastStop", false);
        pluginGeneratedSerialDescriptor.j("specialFeature", false);
        pluginGeneratedSerialDescriptor.j("via", false);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("additionalRouteInfo", false);
        pluginGeneratedSerialDescriptor.j("routeProviderConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OndcMetroRouteSearchAppModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.c(stopAppModel$$serializer), BuiltinSerializersKt.c(stopAppModel$$serializer), lazyArr[4].getValue(), BuiltinSerializersKt.c(stringSerializer), lazyArr[6].getValue(), lazyArr[7].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue()), BuiltinSerializersKt.c(RouteProviderConfigAppModel$$serializer.f8228a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        ChaloTransitMode chaloTransitMode;
        String str;
        List list;
        RouteProviderConfigAppModel routeProviderConfigAppModel;
        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel;
        RouteNamingSchemeType routeNamingSchemeType;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String str2;
        String str3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcMetroRouteSearchAppModel.k;
        int i2 = 9;
        int i3 = 8;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
            StopAppModel stopAppModel3 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stopAppModel$$serializer, null);
            StopAppModel stopAppModel4 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stopAppModel$$serializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, null);
            RouteNamingSchemeType routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            originDestinationAdditionalRouteInfoAppModel = (OriginDestinationAdditionalRouteInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            str2 = strDecodeStringElement2;
            routeProviderConfigAppModel = (RouteProviderConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RouteProviderConfigAppModel$$serializer.f8228a, null);
            str = str4;
            stopAppModel = stopAppModel4;
            stopAppModel2 = stopAppModel3;
            chaloTransitMode = chaloTransitMode2;
            routeNamingSchemeType = routeNamingSchemeType2;
            i = 1023;
            list = list2;
            str3 = strDecodeStringElement3;
        } else {
            int i4 = 7;
            int i5 = 6;
            int i6 = 4;
            boolean z = true;
            int i7 = 0;
            ChaloTransitMode chaloTransitMode3 = null;
            String str5 = null;
            List list3 = null;
            RouteProviderConfigAppModel routeProviderConfigAppModel2 = null;
            OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel2 = null;
            RouteNamingSchemeType routeNamingSchemeType3 = null;
            StopAppModel stopAppModel5 = null;
            StopAppModel stopAppModel6 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int i8 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 8;
                        i6 = 4;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 0:
                        i7 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 9;
                        i3 = 8;
                        i6 = 4;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i2 = 9;
                        i3 = 8;
                        i6 = 4;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 2:
                        stopAppModel6 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StopAppModel$$serializer.f1728a, stopAppModel6);
                        i7 |= 4;
                        i2 = 9;
                        i3 = 8;
                        i6 = 4;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 3:
                        stopAppModel5 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StopAppModel$$serializer.f1728a, stopAppModel5);
                        i7 |= 8;
                        i2 = 9;
                        i3 = 8;
                        i6 = 4;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), list3);
                        i7 |= 16;
                        i2 = 9;
                        i3 = 8;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 5:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str5);
                        i7 |= 32;
                        i2 = 9;
                        i3 = 8;
                        i5 = 6;
                        i4 = 7;
                        break;
                    case 6:
                        routeNamingSchemeType3 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), routeNamingSchemeType3);
                        i7 |= 64;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 7:
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), chaloTransitMode3);
                        i7 |= 128;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 8:
                        originDestinationAdditionalRouteInfoAppModel2 = (OriginDestinationAdditionalRouteInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), originDestinationAdditionalRouteInfoAppModel2);
                        i7 |= 256;
                        i3 = i8;
                        i2 = 9;
                        break;
                    case 9:
                        routeProviderConfigAppModel2 = (RouteProviderConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, RouteProviderConfigAppModel$$serializer.f8228a, routeProviderConfigAppModel2);
                        i7 |= 512;
                        i3 = i8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            chaloTransitMode = chaloTransitMode3;
            str = str5;
            list = list3;
            routeProviderConfigAppModel = routeProviderConfigAppModel2;
            originDestinationAdditionalRouteInfoAppModel = originDestinationAdditionalRouteInfoAppModel2;
            routeNamingSchemeType = routeNamingSchemeType3;
            stopAppModel = stopAppModel5;
            stopAppModel2 = stopAppModel6;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OndcMetroRouteSearchAppModel(i, str2, str3, stopAppModel2, stopAppModel, list, str, routeNamingSchemeType, chaloTransitMode, originDestinationAdditionalRouteInfoAppModel, routeProviderConfigAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OndcMetroRouteSearchAppModel value = (OndcMetroRouteSearchAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcMetroRouteSearchAppModel.k;
        String str = value.f6766a;
        RouteProviderConfigAppModel routeProviderConfigAppModel = value.j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stopAppModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stopAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), value.i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || routeProviderConfigAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, RouteProviderConfigAppModel$$serializer.f8228a, routeProviderConfigAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
