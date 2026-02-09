@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeImageRepositoty homeImageRepository;

    public List<HomeImageDto> getHomeImages() {
        return homeImageRepository.findAllByOrderByDisplayOrderAsc()
                .stream()
                .map(image -> new HomeImageDto(
                    image.getId(),
                    image.getImageUrl()
                ))
                .toList();
    }
}