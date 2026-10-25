package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngSerializer;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel.Railway.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Railway;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerLegAppModel$Railway$$serializer implements GeneratedSerializer<TripPlannerLegAppModel.Railway> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerLegAppModel$Railway$$serializer f4669a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerLegAppModel$Railway$$serializer tripPlannerLegAppModel$Railway$$serializer = new TripPlannerLegAppModel$Railway$$serializer();
        f4669a = tripPlannerLegAppModel$Railway$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Railway", tripPlannerLegAppModel$Railway$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("fromLatLng", false);
        pluginGeneratedSerialDescriptor.j("toLatLng", false);
        pluginGeneratedSerialDescriptor.j("distanceInMeters", false);
        pluginGeneratedSerialDescriptor.j("travelTimeInSeconds", false);
        pluginGeneratedSerialDescriptor.j("startPlaceName", false);
        pluginGeneratedSerialDescriptor.j("endPlaceName", false);
        pluginGeneratedSerialDescriptor.j("polyline", false);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("firstStop", false);
        pluginGeneratedSerialDescriptor.j("lastStop", false);
        pluginGeneratedSerialDescriptor.j("fare", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(latLngSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(latLngSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(doubleSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(doubleSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, stringSerializer, stopAppModel$$serializer, stopAppModel$$serializer, kSerializerC8};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String str;
        String str2;
        String str3;
        Double d;
        Double d2;
        LatLng latLng;
        LatLng latLng2;
        String str4;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        LatLng latLng3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
            LatLng latLng4 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, null);
            LatLng latLng5 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, null);
            DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
            Double d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, null);
            Double d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
            StopAppModel stopAppModel3 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, stopAppModel$$serializer, null);
            StopAppModel stopAppModel4 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, stopAppModel$$serializer, null);
            latLng2 = latLng5;
            tripPlannerLegFareInfoAppResponseModel = (TripPlannerLegFareInfoAppResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a, null);
            stopAppModel = stopAppModel4;
            str4 = strDecodeStringElement;
            str2 = str7;
            str = str6;
            d = d4;
            stopAppModel2 = stopAppModel3;
            str3 = str5;
            d2 = d3;
            i = 2047;
            latLng = latLng4;
        } else {
            boolean z = true;
            int i4 = 0;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel2 = null;
            StopAppModel stopAppModel5 = null;
            StopAppModel stopAppModel6 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Double d5 = null;
            Double d6 = null;
            LatLng latLng6 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        break;
                    case 0:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LatLngSerializer.f5136a, latLng3);
                        i4 |= 1;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        latLng6 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LatLngSerializer.f5136a, latLng6);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d6);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DoubleSerializer.f18137a, d5);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str10);
                        i4 |= 16;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str8);
                        i4 |= 32;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str9);
                        i4 |= 64;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        c = '\b';
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i2 = 10;
                        break;
                    case 8:
                        c = '\b';
                        stopAppModel6 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, StopAppModel$$serializer.f1728a, stopAppModel6);
                        i4 |= 256;
                        i2 = 10;
                        break;
                    case 9:
                        stopAppModel5 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, StopAppModel$$serializer.f1728a, stopAppModel5);
                        i4 |= 512;
                        break;
                    case 10:
                        tripPlannerLegFareInfoAppResponseModel2 = (TripPlannerLegFareInfoAppResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a, tripPlannerLegFareInfoAppResponseModel2);
                        i4 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            tripPlannerLegFareInfoAppResponseModel = tripPlannerLegFareInfoAppResponseModel2;
            stopAppModel = stopAppModel5;
            stopAppModel2 = stopAppModel6;
            str = str8;
            str2 = str9;
            str3 = str10;
            d = d5;
            d2 = d6;
            latLng = latLng3;
            latLng2 = latLng6;
            str4 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerLegAppModel.Railway(i, latLng, latLng2, d2, d, str3, str, str2, str4, stopAppModel2, stopAppModel, tripPlannerLegFareInfoAppResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerLegAppModel.Railway value = (TripPlannerLegAppModel.Railway) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TripPlannerLegAppModel.Railway.Companion companion = TripPlannerLegAppModel.Railway.INSTANCE;
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, value.j);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, value.l);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.o);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.p);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, stopAppModel$$serializer, value.q);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, stopAppModel$$serializer, value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a, value.s);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
