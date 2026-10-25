package app.chalo.stoptripdetails.data.model.api;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/stoptripdetails/data/model/api/TripApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/TripApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripApiModel$$serializer implements GeneratedSerializer<TripApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripApiModel$$serializer f9487a;
    private static final SerialDescriptor descriptor;

    static {
        TripApiModel$$serializer tripApiModel$$serializer = new TripApiModel$$serializer();
        f9487a = tripApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.stoptripdetails.data.model.api.TripApiModel", tripApiModel$$serializer, 22);
        pluginGeneratedSerialDescriptor.j("agency_name", false);
        pluginGeneratedSerialDescriptor.j("direction_stop", false);
        pluginGeneratedSerialDescriptor.j(TypedValues.TransitionType.S_DURATION, false);
        pluginGeneratedSerialDescriptor.j("extrapolated", false);
        pluginGeneratedSerialDescriptor.j("first_stop", false);
        pluginGeneratedSerialDescriptor.j("frequency_data_array", false);
        pluginGeneratedSerialDescriptor.j("isFrequencyTrip", false);
        pluginGeneratedSerialDescriptor.j("isShortTrip", false);
        pluginGeneratedSerialDescriptor.j("last_stop", false);
        pluginGeneratedSerialDescriptor.j("route_id", false);
        pluginGeneratedSerialDescriptor.j("route_name", false);
        pluginGeneratedSerialDescriptor.j("special_features", false);
        pluginGeneratedSerialDescriptor.j("spf", false);
        pluginGeneratedSerialDescriptor.j("transport_type", false);
        pluginGeneratedSerialDescriptor.j("trip_id", false);
        pluginGeneratedSerialDescriptor.j("ttSid", false);
        pluginGeneratedSerialDescriptor.j("ttStatus", false);
        pluginGeneratedSerialDescriptor.j("tt_type", false);
        pluginGeneratedSerialDescriptor.j("platform", false);
        pluginGeneratedSerialDescriptor.j("availabilityLevel", false);
        pluginGeneratedSerialDescriptor.j("via", false);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TripApiModel.w;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        StopApiModel$$serializer stopApiModel$$serializer = StopApiModel$$serializer.f1694a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stopApiModel$$serializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, intSerializer, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stopApiModel$$serializer), BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stopApiModel$$serializer), stringSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[11].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue()), stringSerializer, stringSerializer, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), intSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        Integer num;
        Integer num2;
        StopApiModel stopApiModel;
        StopApiModel stopApiModel2;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        List list;
        List list2;
        Boolean bool2;
        Boolean bool3;
        StopApiModel stopApiModel3;
        List list3;
        String str6;
        int i;
        String str7;
        String str8;
        String str9;
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripApiModel.w;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            StopApiModel$$serializer stopApiModel$$serializer = StopApiModel$$serializer.f1694a;
            StopApiModel stopApiModel4 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stopApiModel$$serializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            StopApiModel stopApiModel5 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stopApiModel$$serializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            StopApiModel stopApiModel6 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stopApiModel$$serializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            i = 4194303;
            i2 = iDecodeIntElement2;
            list3 = list4;
            stopApiModel3 = stopApiModel5;
            i3 = iDecodeIntElement;
            str9 = strDecodeStringElement3;
            bool = bool5;
            stopApiModel2 = stopApiModel4;
            stopApiModel = stopApiModel6;
            bool2 = bool6;
            str6 = strDecodeStringElement;
            str3 = str11;
            str5 = str14;
            str4 = str13;
            str2 = str12;
            num2 = num4;
            str = str10;
            list = list6;
            str8 = strDecodeStringElement2;
            num = num3;
            list2 = list5;
            bool3 = bool4;
        } else {
            Integer num5 = null;
            int i6 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            String str15 = null;
            Boolean bool7 = null;
            Integer num6 = null;
            StopApiModel stopApiModel7 = null;
            Boolean bool8 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            List list7 = null;
            List list8 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String str19 = null;
            StopApiModel stopApiModel8 = null;
            Boolean bool9 = null;
            StopApiModel stopApiModel9 = null;
            int i7 = 5;
            boolean z = true;
            String str20 = null;
            List list9 = null;
            while (z) {
                List list10 = list9;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        bool8 = bool8;
                        bool7 = bool7;
                        list9 = list10;
                        str15 = str15;
                        i7 = 5;
                        break;
                    case 0:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str19);
                        i6 |= 1;
                        bool8 = bool8;
                        bool7 = bool7;
                        list9 = list10;
                        str15 = str15;
                        i7 = 5;
                        break;
                    case 1:
                        str15 = str15;
                        list10 = list10;
                        stopApiModel8 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StopApiModel$$serializer.f1694a, stopApiModel8);
                        i6 |= 2;
                        bool8 = bool8;
                        bool9 = bool9;
                        list9 = list10;
                        str15 = str15;
                        i7 = 5;
                        break;
                    case 2:
                        str15 = str15;
                        list10 = list10;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        bool8 = bool8;
                        i6 |= 4;
                        list9 = list10;
                        str15 = str15;
                        i7 = 5;
                        break;
                    case 3:
                        str15 = str15;
                        list10 = list10;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.f18123a, bool9);
                        i6 |= 8;
                        bool8 = bool8;
                        stopApiModel9 = stopApiModel9;
                        list9 = list10;
                        str15 = str15;
                        i7 = 5;
                        break;
                    case 4:
                        str15 = str15;
                        list10 = list10;
                        stopApiModel9 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StopApiModel$$serializer.f1694a, stopApiModel9);
                        i6 |= 16;
                        bool8 = bool8;
                        list9 = list10;
                        str15 = str15;
                        i7 = 5;
                        break;
                    case 5:
                        String str21 = str15;
                        Boolean bool10 = bool8;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i7].getValue();
                        int i8 = i7;
                        List list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, deserializationStrategy, list10);
                        i7 = i8;
                        i6 |= 32;
                        bool8 = bool10;
                        list9 = list11;
                        str15 = str21;
                        break;
                    case 6:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool8);
                        i6 |= 64;
                        str15 = str15;
                        list9 = list10;
                        break;
                    case 7:
                        bool8 = bool8;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.f18123a, bool7);
                        i6 |= 128;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 8:
                        bool8 = bool8;
                        stopApiModel7 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StopApiModel$$serializer.f1694a, stopApiModel7);
                        i6 |= 256;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 9:
                        bool8 = bool8;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 10:
                        bool8 = bool8;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str20);
                        i6 |= 1024;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 11:
                        bool8 = bool8;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), list8);
                        i6 |= 2048;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 12:
                        bool8 = bool8;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list7);
                        i6 |= 4096;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 13:
                        bool8 = bool8;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 14:
                        bool8 = bool8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 |= 16384;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 15:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, num5);
                        i4 = 32768;
                        i6 |= i4;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 16:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.f18146a, num6);
                        i4 = 65536;
                        i6 |= i4;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 17:
                        bool8 = bool8;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
                        i6 |= 131072;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 18:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str16);
                        i5 = 262144;
                        i6 |= i5;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 19:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str17);
                        i5 = 524288;
                        i6 |= i5;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 20:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.f18170a, str18);
                        i5 = 1048576;
                        i6 |= i5;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    case 21:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str15);
                        i5 = 2097152;
                        i6 |= i5;
                        list9 = list10;
                        bool8 = bool8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str19;
            num = num5;
            num2 = num6;
            stopApiModel = stopApiModel7;
            stopApiModel2 = stopApiModel8;
            str2 = str16;
            str3 = str20;
            bool = bool8;
            str4 = str17;
            str5 = str18;
            list = list7;
            list2 = list8;
            bool2 = bool7;
            bool3 = bool9;
            stopApiModel3 = stopApiModel9;
            list3 = list9;
            str6 = strDecodeStringElement4;
            i = i6;
            str7 = str15;
            str8 = strDecodeStringElement5;
            str9 = strDecodeStringElement6;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripApiModel(i, str, stopApiModel2, i3, bool3, stopApiModel3, list3, bool, bool2, stopApiModel, str6, str3, list2, list, str8, str9, num, num2, i2, str2, str4, str5, str7);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripApiModel value = (TripApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripApiModel.w;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f9486a);
        StopApiModel$$serializer stopApiModel$$serializer = StopApiModel$$serializer.f1694a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stopApiModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.c);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stopApiModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stopApiModel$$serializer, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 13, value.n);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 14, value.o);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, intSerializer, value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, intSerializer, value.q);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 17, value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, value.s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, value.t);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, value.u);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, value.v);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
