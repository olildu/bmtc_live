package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/metro/ui/landing/MetroLandingScreenRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MetroLandingScreenRestoredState$$serializer implements GeneratedSerializer<MetroLandingScreenRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MetroLandingScreenRestoredState$$serializer f5494a;
    private static final SerialDescriptor descriptor;

    static {
        MetroLandingScreenRestoredState$$serializer metroLandingScreenRestoredState$$serializer = new MetroLandingScreenRestoredState$$serializer();
        f5494a = metroLandingScreenRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.metro.ui.landing.MetroLandingScreenRestoredState", metroLandingScreenRestoredState$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("ondcConfigId", true);
        pluginGeneratedSerialDescriptor.j("ondcAgencyName", true);
        pluginGeneratedSerialDescriptor.j("isRouteBasedFlow", true);
        pluginGeneratedSerialDescriptor.j("pickStopRequestId", true);
        pluginGeneratedSerialDescriptor.j("pickStopRequestType", false);
        pluginGeneratedSerialDescriptor.j("linesToStopListMap", true);
        pluginGeneratedSerialDescriptor.j("metroLineItemStateList", true);
        pluginGeneratedSerialDescriptor.j("selectedLine", true);
        pluginGeneratedSerialDescriptor.j("selectedFromStation", true);
        pluginGeneratedSerialDescriptor.j("selectedToStation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MetroLandingScreenRestoredState.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(BooleanSerializer.f18123a), BuiltinSerializersKt.c(stringSerializer), lazyArr[4].getValue(), lazyArr[5].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[6].getValue()), BuiltinSerializersKt.c(MetroLineListItemState$$serializer.f5510a), BuiltinSerializersKt.c(stopAppModel$$serializer), BuiltinSerializersKt.c(stopAppModel$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        StopAppModel stopAppModel;
        Map map;
        PickStopRequestType pickStopRequestType;
        StopAppModel stopAppModel2;
        MetroLineListItemState metroLineListItemState;
        List list;
        String str;
        Boolean bool;
        String str2;
        String str3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MetroLandingScreenRestoredState.k;
        int i2 = 9;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            PickStopRequestType pickStopRequestType2 = (PickStopRequestType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            MetroLineListItemState metroLineListItemState2 = (MetroLineListItemState) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, MetroLineListItemState$$serializer.f5510a, null);
            StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
            StopAppModel stopAppModel3 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stopAppModel$$serializer, null);
            list = list2;
            str = str7;
            stopAppModel = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stopAppModel$$serializer, null);
            metroLineListItemState = metroLineListItemState2;
            pickStopRequestType = pickStopRequestType2;
            stopAppModel2 = stopAppModel3;
            bool = bool2;
            i = 1023;
            map = map2;
            str3 = str6;
            str2 = str5;
        } else {
            int i3 = 6;
            int i4 = 5;
            int i5 = 4;
            boolean z = true;
            int i6 = 0;
            StopAppModel stopAppModel4 = null;
            Map map3 = null;
            PickStopRequestType pickStopRequestType3 = null;
            StopAppModel stopAppModel5 = null;
            MetroLineListItemState metroLineListItemState3 = null;
            List list3 = null;
            String str8 = null;
            Boolean bool3 = null;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i5 = 4;
                        i4 = 5;
                        i3 = 6;
                        break;
                    case 0:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str4);
                        i6 |= 1;
                        i2 = 9;
                        i5 = 4;
                        i4 = 5;
                        i3 = 6;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str9);
                        i6 |= 2;
                        i2 = 9;
                        i5 = 4;
                        i4 = 5;
                        i3 = 6;
                        break;
                    case 2:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, bool3);
                        i6 |= 4;
                        i2 = 9;
                        i5 = 4;
                        i4 = 5;
                        i3 = 6;
                        break;
                    case 3:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str8);
                        i6 |= 8;
                        i2 = 9;
                        i5 = 4;
                        i4 = 5;
                        i3 = 6;
                        break;
                    case 4:
                        pickStopRequestType3 = (PickStopRequestType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), pickStopRequestType3);
                        i6 |= 16;
                        i2 = 9;
                        i4 = 5;
                        i3 = 6;
                        break;
                    case 5:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), map3);
                        i6 |= 32;
                        i2 = 9;
                        i3 = 6;
                        break;
                    case 6:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list3);
                        i6 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        metroLineListItemState3 = (MetroLineListItemState) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, MetroLineListItemState$$serializer.f5510a, metroLineListItemState3);
                        i6 |= 128;
                        i2 = 9;
                        break;
                    case 8:
                        stopAppModel5 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StopAppModel$$serializer.f1728a, stopAppModel5);
                        i6 |= 256;
                        i2 = 9;
                        break;
                    case 9:
                        stopAppModel4 = (StopAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StopAppModel$$serializer.f1728a, stopAppModel4);
                        i6 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            stopAppModel = stopAppModel4;
            map = map3;
            pickStopRequestType = pickStopRequestType3;
            stopAppModel2 = stopAppModel5;
            metroLineListItemState = metroLineListItemState3;
            list = list3;
            str = str8;
            bool = bool3;
            str2 = str4;
            str3 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MetroLandingScreenRestoredState(i, str2, str3, bool, str, pickStopRequestType, map, list, metroLineListItemState, stopAppModel2, stopAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MetroLandingScreenRestoredState value = (MetroLandingScreenRestoredState) obj;
        Intrinsics.i(value, "value");
        String str = value.d;
        Boolean bool = value.c;
        String str2 = value.b;
        String str3 = value.f5493a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MetroLandingScreenRestoredState.k;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str);
        }
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[4].getValue();
        PickStopRequestType pickStopRequestType = value.e;
        StopAppModel stopAppModel = value.j;
        StopAppModel stopAppModel2 = value.i;
        MetroLineListItemState metroLineListItemState = value.h;
        List list = value.g;
        Map map = value.f;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, serializationStrategy, pickStopRequestType);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(map, MapsKt.d())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || metroLineListItemState != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, MetroLineListItemState$$serializer.f5510a, metroLineListItemState);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || stopAppModel2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StopAppModel$$serializer.f1728a, stopAppModel2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || stopAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StopAppModel$$serializer.f1728a, stopAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
