package app.chalo.behaviour.policy;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngSerializer;
import java.util.Set;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/behaviour/policy/CitySelectionPolicyOverride.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/behaviour/policy/CitySelectionPolicyOverride;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CitySelectionPolicyOverride$$serializer implements GeneratedSerializer<CitySelectionPolicyOverride> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CitySelectionPolicyOverride$$serializer f1002a;
    private static final SerialDescriptor descriptor;

    static {
        CitySelectionPolicyOverride$$serializer citySelectionPolicyOverride$$serializer = new CitySelectionPolicyOverride$$serializer();
        f1002a = citySelectionPolicyOverride$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.behaviour.policy.CitySelectionPolicyOverride", citySelectionPolicyOverride$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("cityIdsWithDisabledCityChange", true);
        pluginGeneratedSerialDescriptor.j("isCityDiscontinuedOptionAvailable", true);
        pluginGeneratedSerialDescriptor.j("validAutoSelectionCityIds", true);
        pluginGeneratedSerialDescriptor.j("autoSelectionLocation", true);
        pluginGeneratedSerialDescriptor.j("welcomeScreenIcon", true);
        pluginGeneratedSerialDescriptor.j("useUpdatedHomeScreenProductPurchaseCards", true);
        pluginGeneratedSerialDescriptor.j("ticketReceiptFormat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = CitySelectionPolicyOverride.h;
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) lazyArr[0].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue()), BuiltinSerializersKt.c(LatLngSerializer.f5136a), BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[6].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        TicketReceiptFormatConfig ticketReceiptFormatConfig;
        Boolean bool;
        Set set;
        Boolean bool2;
        Set set2;
        LatLng latLng;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CitySelectionPolicyOverride.h;
        int i2 = 5;
        int i3 = 2;
        Set set3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Set set4 = (Set) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            Set set5 = (Set) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            LatLng latLng2 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LatLngSerializer.f5136a, null);
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            ticketReceiptFormatConfig = (TicketReceiptFormatConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            set = set4;
            bool = bool4;
            latLng = latLng2;
            str = str2;
            i = 127;
            set2 = set5;
            bool2 = bool3;
        } else {
            boolean z = true;
            int i4 = 0;
            TicketReceiptFormatConfig ticketReceiptFormatConfig2 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Set set6 = null;
            LatLng latLng3 = null;
            String str3 = null;
            while (z) {
                int i5 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        i3 = 2;
                        break;
                    case 0:
                        set3 = (Set) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), set3);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 2;
                        break;
                    case 1:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.f18123a, bool6);
                        i4 |= 2;
                        i2 = 5;
                        i3 = 2;
                        break;
                    case 2:
                        set6 = (Set) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), set6);
                        i4 |= 4;
                        i3 = i5;
                        i2 = 5;
                        break;
                    case 3:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LatLngSerializer.f5136a, latLng3);
                        i4 |= 8;
                        i3 = i5;
                        break;
                    case 4:
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str3);
                        i4 |= 16;
                        i3 = i5;
                        break;
                    case 5:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.f18123a, bool5);
                        i4 |= 32;
                        i3 = i5;
                        break;
                    case 6:
                        ticketReceiptFormatConfig2 = (TicketReceiptFormatConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), ticketReceiptFormatConfig2);
                        i4 |= 64;
                        i3 = i5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            ticketReceiptFormatConfig = ticketReceiptFormatConfig2;
            bool = bool5;
            set = set3;
            bool2 = bool6;
            set2 = set6;
            latLng = latLng3;
            str = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CitySelectionPolicyOverride(i, set, bool2, set2, latLng, str, bool, ticketReceiptFormatConfig);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CitySelectionPolicyOverride value = (CitySelectionPolicyOverride) obj;
        Intrinsics.i(value, "value");
        TicketReceiptFormatConfig ticketReceiptFormatConfig = value.g;
        Boolean bool = value.f;
        String str = value.e;
        LatLng latLng = value.d;
        Set set = value.c;
        Boolean bool2 = value.b;
        Set set2 = value.f1001a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CitySelectionPolicyOverride.h;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || set2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), set2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || bool2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.f18123a, bool2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || set != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), set);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || latLng != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LatLngSerializer.f5136a, latLng);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || ticketReceiptFormatConfig != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), ticketReceiptFormatConfig);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
