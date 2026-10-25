package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerCityConfigModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerCityConfigModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerCityConfigModel$$serializer implements GeneratedSerializer<TripPlannerCityConfigModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerCityConfigModel$$serializer f4658a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerCityConfigModel$$serializer tripPlannerCityConfigModel$$serializer = new TripPlannerCityConfigModel$$serializer();
        f4658a = tripPlannerCityConfigModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel", tripPlannerCityConfigModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("city", true);
        pluginGeneratedSerialDescriptor.j("shouldOpenDirectly", true);
        pluginGeneratedSerialDescriptor.j("minAppVer", true);
        pluginGeneratedSerialDescriptor.j("maxAppVer", true);
        pluginGeneratedSerialDescriptor.j("shouldPaginate", true);
        pluginGeneratedSerialDescriptor.j("tabs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TripPlannerCityConfigModel.g;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{StringSerializer.f18170a, booleanSerializer, intSerializer, intSerializer, booleanSerializer, lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        String str;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerCityConfigModel.g;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str = strDecodeStringElement;
            i = iDecodeIntElement2;
            z = zDecodeBooleanElement2;
            i2 = iDecodeIntElement;
            i3 = 63;
            z2 = zDecodeBooleanElement;
        } else {
            boolean z3 = true;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int i4 = 0;
            boolean zDecodeBooleanElement3 = false;
            String strDecodeStringElement2 = null;
            List list2 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list2);
                        i4 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement3;
            z = zDecodeBooleanElement4;
            i2 = iDecodeIntElement4;
            i3 = i4;
            z2 = zDecodeBooleanElement3;
            str = strDecodeStringElement2;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerCityConfigModel(i3, str, z2, i2, i, z, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerCityConfigModel value = (TripPlannerCityConfigModel) obj;
        Intrinsics.i(value, "value");
        List list = value.f;
        boolean z = value.e;
        int i = value.d;
        int i2 = value.c;
        boolean z2 = value.b;
        String str = value.f4657a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerCityConfigModel.g;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i2 != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || i != Integer.MAX_VALUE) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(list, CollectionsKt.S(new TripPlannerTabTypeConfigModel("All", ChaloTransitMode.ALL.getMode(), -1, true), new TripPlannerTabTypeConfigModel(ChaloTransitMode.BUS.getMode())))) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
