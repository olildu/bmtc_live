package app.chalo.homescreen.data.model.app;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/NavigationTabAppModel.RegularBusTab.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$RegularBusTab;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class NavigationTabAppModel$RegularBusTab$$serializer implements GeneratedSerializer<NavigationTabAppModel.RegularBusTab> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NavigationTabAppModel$RegularBusTab$$serializer f3765a;
    private static final SerialDescriptor descriptor;

    static {
        NavigationTabAppModel$RegularBusTab$$serializer navigationTabAppModel$RegularBusTab$$serializer = new NavigationTabAppModel$RegularBusTab$$serializer();
        f3765a = navigationTabAppModel$RegularBusTab$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.NavigationTabAppModel.RegularBusTab", navigationTabAppModel$RegularBusTab$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("bottomNavTabAppModel", false);
        pluginGeneratedSerialDescriptor.j("regularBusScreenConfigAppModel", false);
        pluginGeneratedSerialDescriptor.j("navTabAppModel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BottomNavTabAppModel$$serializer bottomNavTabAppModel$$serializer = BottomNavTabAppModel$$serializer.f3717a;
        return new KSerializer[]{bottomNavTabAppModel$$serializer, RegularBusScreenConfigAppModel$$serializer.f3796a, bottomNavTabAppModel$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        BottomNavTabAppModel bottomNavTabAppModel;
        RegularBusScreenConfigAppModel regularBusScreenConfigAppModel;
        BottomNavTabAppModel bottomNavTabAppModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        BottomNavTabAppModel bottomNavTabAppModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BottomNavTabAppModel$$serializer bottomNavTabAppModel$$serializer = BottomNavTabAppModel$$serializer.f3717a;
            bottomNavTabAppModel = (BottomNavTabAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, bottomNavTabAppModel$$serializer, null);
            regularBusScreenConfigAppModel = (RegularBusScreenConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RegularBusScreenConfigAppModel$$serializer.f3796a, null);
            bottomNavTabAppModel2 = (BottomNavTabAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, bottomNavTabAppModel$$serializer, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            RegularBusScreenConfigAppModel regularBusScreenConfigAppModel2 = null;
            BottomNavTabAppModel bottomNavTabAppModel4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bottomNavTabAppModel3 = (BottomNavTabAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BottomNavTabAppModel$$serializer.f3717a, bottomNavTabAppModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    regularBusScreenConfigAppModel2 = (RegularBusScreenConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RegularBusScreenConfigAppModel$$serializer.f3796a, regularBusScreenConfigAppModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bottomNavTabAppModel4 = (BottomNavTabAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BottomNavTabAppModel$$serializer.f3717a, bottomNavTabAppModel4);
                    i2 |= 4;
                }
            }
            i = i2;
            bottomNavTabAppModel = bottomNavTabAppModel3;
            regularBusScreenConfigAppModel = regularBusScreenConfigAppModel2;
            bottomNavTabAppModel2 = bottomNavTabAppModel4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NavigationTabAppModel.RegularBusTab(i, bottomNavTabAppModel, regularBusScreenConfigAppModel, bottomNavTabAppModel2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        NavigationTabAppModel.RegularBusTab value = (NavigationTabAppModel.RegularBusTab) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NavigationTabAppModel.RegularBusTab.Companion companion = NavigationTabAppModel.RegularBusTab.INSTANCE;
        BottomNavTabAppModel$$serializer bottomNavTabAppModel$$serializer = BottomNavTabAppModel$$serializer.f3717a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, bottomNavTabAppModel$$serializer, value.f3761a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, RegularBusScreenConfigAppModel$$serializer.f3796a, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, bottomNavTabAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
