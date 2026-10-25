package app.chalo.livetracking.universalsearch.data.model.app;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/universalsearch/data/model/app/RouteSubscriptionInfoAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/app/RouteSubscriptionInfoAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteSubscriptionInfoAppModel$$serializer implements GeneratedSerializer<RouteSubscriptionInfoAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteSubscriptionInfoAppModel$$serializer f4995a;
    private static final SerialDescriptor descriptor;

    static {
        RouteSubscriptionInfoAppModel$$serializer routeSubscriptionInfoAppModel$$serializer = new RouteSubscriptionInfoAppModel$$serializer();
        f4995a = routeSubscriptionInfoAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.universalsearch.data.model.app.RouteSubscriptionInfoAppModel", routeSubscriptionInfoAppModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("_routeId", true);
        pluginGeneratedSerialDescriptor.j("_routeDetailsViewCount", true);
        pluginGeneratedSerialDescriptor.j("_routeDetailsLastSeen", true);
        pluginGeneratedSerialDescriptor.j("_isAutoSubscriptionDialogShown", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(StringSerializer.f18170a), IntSerializer.f18146a, LongSerializer.f18151a, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        boolean zDecodeBooleanElement;
        int i;
        int iDecodeIntElement;
        long jDecodeLongElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            i = 15;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            str = null;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            iDecodeIntElement = iDecodeIntElement2;
            jDecodeLongElement = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        RouteSubscriptionInfoAppModel routeSubscriptionInfoAppModel = new RouteSubscriptionInfoAppModel();
        if ((i & 1) == 0) {
            routeSubscriptionInfoAppModel.f4994a = null;
        } else {
            routeSubscriptionInfoAppModel.f4994a = str;
        }
        if ((i & 2) == 0) {
            routeSubscriptionInfoAppModel.b = 0;
        } else {
            routeSubscriptionInfoAppModel.b = iDecodeIntElement;
        }
        if ((i & 4) == 0) {
            routeSubscriptionInfoAppModel.c = -1L;
        } else {
            routeSubscriptionInfoAppModel.c = jDecodeLongElement;
        }
        if ((i & 8) == 0) {
            routeSubscriptionInfoAppModel.d = false;
            return routeSubscriptionInfoAppModel;
        }
        routeSubscriptionInfoAppModel.d = zDecodeBooleanElement;
        return routeSubscriptionInfoAppModel;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteSubscriptionInfoAppModel value = (RouteSubscriptionInfoAppModel) obj;
        Intrinsics.i(value, "value");
        boolean z = value.d;
        long j = value.c;
        int i = value.b;
        String str = value.f4994a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
