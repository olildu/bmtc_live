package app.chalo.stoptripdetails.data.model.api;

import app.chalo.citydata.data.model.api.response.StopApiModel;
import app.chalo.citydata.data.model.api.response.StopApiModel$$serializer;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/stoptripdetails/data/model/api/LocationSummaryPayloadApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryPayloadApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class LocationSummaryPayloadApiResponseModel$$serializer implements GeneratedSerializer<LocationSummaryPayloadApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LocationSummaryPayloadApiResponseModel$$serializer f9478a;
    private static final SerialDescriptor descriptor;

    static {
        LocationSummaryPayloadApiResponseModel$$serializer locationSummaryPayloadApiResponseModel$$serializer = new LocationSummaryPayloadApiResponseModel$$serializer();
        f9478a = locationSummaryPayloadApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.stoptripdetails.data.model.api.LocationSummaryPayloadApiResponseModel", locationSummaryPayloadApiResponseModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j(ErrorBundle.SUMMARY_ENTRY, false);
        pluginGeneratedSerialDescriptor.j("agency_name", false);
        pluginGeneratedSerialDescriptor.j("distance", false);
        pluginGeneratedSerialDescriptor.j("stop", false);
        pluginGeneratedSerialDescriptor.j("stop_id", false);
        pluginGeneratedSerialDescriptor.j("transport_type", false);
        pluginGeneratedSerialDescriptor.j("station_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) LocationSummaryPayloadApiResponseModel.h[0].getValue());
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(DoubleSerializer.f18137a), BuiltinSerializersKt.c(StopApiModel$$serializer.f1694a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        Double d;
        StopApiModel stopApiModel;
        String str3;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LocationSummaryPayloadApiResponseModel.h;
        int i2 = 6;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, null);
            StopApiModel stopApiModel2 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StopApiModel$$serializer.f1694a, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            list = list3;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            i = 127;
            stopApiModel = stopApiModel2;
            str3 = str5;
            d = d2;
            str2 = str4;
        } else {
            boolean z = true;
            int i3 = 0;
            String str6 = null;
            String str7 = null;
            Double d3 = null;
            StopApiModel stopApiModel3 = null;
            String str8 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str7);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d3);
                        i3 |= 4;
                        break;
                    case 3:
                        stopApiModel3 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StopApiModel$$serializer.f1694a, stopApiModel3);
                        i3 |= 8;
                        break;
                    case 4:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str8);
                        i3 |= 16;
                        break;
                    case 5:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str6);
                        i3 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str6;
            list = list2;
            str2 = str7;
            d = d3;
            stopApiModel = stopApiModel3;
            str3 = str8;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LocationSummaryPayloadApiResponseModel(i, list, str2, d, stopApiModel, str3, str, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        LocationSummaryPayloadApiResponseModel value = (LocationSummaryPayloadApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (SerializationStrategy) LocationSummaryPayloadApiResponseModel.h[0].getValue(), value.f9477a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StopApiModel$$serializer.f1694a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
