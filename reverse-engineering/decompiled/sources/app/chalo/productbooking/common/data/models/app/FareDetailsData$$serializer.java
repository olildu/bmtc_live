package app.chalo.productbooking.common.data.models.app;

import app.chalo.providers.RouteNamingSchemeType;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/app/FareDetailsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/app/FareDetailsData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class FareDetailsData$$serializer implements GeneratedSerializer<FareDetailsData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FareDetailsData$$serializer f8186a;
    private static final SerialDescriptor descriptor;

    static {
        FareDetailsData$$serializer fareDetailsData$$serializer = new FareDetailsData$$serializer();
        f8186a = fareDetailsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.app.FareDetailsData", fareDetailsData$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("routeData", false);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("timeInMillis", true);
        pluginGeneratedSerialDescriptor.j("tncList", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingSchemeType", true);
        pluginGeneratedSerialDescriptor.j("seats", true);
        pluginGeneratedSerialDescriptor.j("userAcquisitionChannel", true);
        pluginGeneratedSerialDescriptor.j("userCampaign", true);
        pluginGeneratedSerialDescriptor.j("seatCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FareDetailsData.m;
        ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{FareDetailsRouteData$$serializer.f8188a, productBookingStopDetails$$serializer, productBookingStopDetails$$serializer, lazyArr[3].getValue(), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.c(stringSerializer), lazyArr[7].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(IntSerializer.f18146a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        FareDetailsRouteData fareDetailsRouteData;
        ProductBookingStopDetails productBookingStopDetails;
        int i;
        String str2;
        RouteNamingSchemeType routeNamingSchemeType;
        List list;
        List list2;
        String str3;
        Integer num;
        Long l;
        List list3;
        ProductBookingStopDetails productBookingStopDetails2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FareDetailsData.m;
        FareDetailsRouteData fareDetailsRouteData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FareDetailsRouteData fareDetailsRouteData3 = (FareDetailsRouteData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, FareDetailsRouteData$$serializer.f8188a, null);
            ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
            ProductBookingStopDetails productBookingStopDetails3 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, productBookingStopDetails$$serializer, null);
            ProductBookingStopDetails productBookingStopDetails4 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, productBookingStopDetails$$serializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            RouteNamingSchemeType routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            list2 = list6;
            fareDetailsRouteData = fareDetailsRouteData3;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, null);
            routeNamingSchemeType = routeNamingSchemeType2;
            str2 = str5;
            str3 = str4;
            l = l2;
            productBookingStopDetails = productBookingStopDetails4;
            list = list5;
            list3 = list4;
            i = 4095;
            productBookingStopDetails2 = productBookingStopDetails3;
        } else {
            ProductBookingStopDetails productBookingStopDetails5 = null;
            ProductBookingStopDetails productBookingStopDetails6 = null;
            String str6 = null;
            RouteNamingSchemeType routeNamingSchemeType3 = null;
            List list7 = null;
            int i2 = 7;
            int i3 = 5;
            int i4 = 3;
            int i5 = 8;
            boolean z = true;
            int i6 = 0;
            str = null;
            List list8 = null;
            String str7 = null;
            Integer num2 = null;
            Long l3 = null;
            List list9 = null;
            while (z) {
                lazyArr = lazyArr;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        productBookingStopDetails5 = productBookingStopDetails5;
                        i4 = 3;
                        i3 = 5;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 0:
                        fareDetailsRouteData2 = (FareDetailsRouteData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, FareDetailsRouteData$$serializer.f8188a, fareDetailsRouteData2);
                        i6 |= 1;
                        productBookingStopDetails5 = productBookingStopDetails5;
                        i4 = 3;
                        i3 = 5;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        productBookingStopDetails5 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ProductBookingStopDetails$$serializer.f8200a, productBookingStopDetails5);
                        i6 |= 2;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i4 = 3;
                        i3 = 5;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        productBookingStopDetails6 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ProductBookingStopDetails$$serializer.f8200a, productBookingStopDetails6);
                        i6 |= 4;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i4 = 3;
                        i3 = 5;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), list9);
                        i6 |= 8;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i3 = 5;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l3);
                        i6 |= 16;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i3 = 5;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list7);
                        i6 |= 32;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str7);
                        i6 |= 64;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i2 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        routeNamingSchemeType3 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), routeNamingSchemeType3);
                        i6 |= 128;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        i5 = 8;
                        break;
                    case 8:
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list8);
                        i6 |= 256;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        break;
                    case 9:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str6);
                        i6 |= 512;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        break;
                    case 10:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str);
                        i6 |= 1024;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        break;
                    case 11:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num2);
                        i6 |= 2048;
                        lazyArr = lazyArr;
                        fareDetailsRouteData2 = fareDetailsRouteData2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            fareDetailsRouteData = fareDetailsRouteData2;
            productBookingStopDetails = productBookingStopDetails6;
            i = i6;
            str2 = str6;
            routeNamingSchemeType = routeNamingSchemeType3;
            list = list7;
            list2 = list8;
            str3 = str7;
            num = num2;
            l = l3;
            list3 = list9;
            productBookingStopDetails2 = productBookingStopDetails5;
        }
        String str8 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FareDetailsData(i, fareDetailsRouteData, productBookingStopDetails2, productBookingStopDetails, list3, l, list, str3, routeNamingSchemeType, list2, str2, str8, num);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FareDetailsData value = (FareDetailsData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FareDetailsData.m;
        FareDetailsRouteData$$serializer fareDetailsRouteData$$serializer = FareDetailsRouteData$$serializer.f8188a;
        FareDetailsRouteData fareDetailsRouteData = value.f8185a;
        Integer num = value.l;
        String str = value.k;
        String str2 = value.j;
        List list = value.i;
        RouteNamingSchemeType routeNamingSchemeType = value.h;
        String str3 = value.g;
        List list2 = value.f;
        Long l = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, fareDetailsRouteData$$serializer, fareDetailsRouteData);
        ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, productBookingStopDetails$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, productBookingStopDetails$$serializer, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), routeNamingSchemeType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
